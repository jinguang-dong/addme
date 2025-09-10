package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptv extends Exception {
    public final sbp a;

    private ptv(String str, Throwable th, sbp sbpVar) {
        super(str, th);
        this.a = sbpVar;
    }

    static Throwable a(Throwable th) {
        Throwable cause = th.getCause();
        return (cause != null && th.getClass().equals(ExecutionException.class)) ? a(cause) : th;
    }

    private static String c(Throwable th, int i) {
        String str = th.getClass().getName() + ": " + th.getMessage();
        Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + c(cause, i + 1);
    }

    public static void b(Collection collection, String str, Object... objArr) {
        Iterator it = collection.iterator();
        sbk sbkVar = null;
        while (it.hasNext()) {
            try {
                ske.U((syu) it.next());
            } catch (CancellationException | ExecutionException e) {
                if (sbkVar == null) {
                    int i = sbp.d;
                    sbkVar = new sbk();
                }
                sbkVar.h(a(e));
            }
        }
        if (sbkVar == null) {
            return;
        }
        sbp sbpVarG = sbkVar.g();
        String strConcat = String.format(Locale.US, str, objArr);
        int i2 = ((sex) sbpVarG).c;
        if (i2 > 1) {
            String str2 = strConcat + "\n" + i2 + " failure(s) in total:\n";
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        printWriter.println(str2);
                        int i3 = 0;
                        while (i3 < i2) {
                            Throwable th = (Throwable) sbpVarG.get(i3);
                            i3++;
                            printWriter.printf("--- Failure %d ----------------------------\n", Integer.valueOf(i3));
                            printWriter.println(c(th, 1));
                        }
                        printWriter.println(pAAtrB.WDYMDuWKbZdGK);
                        strConcat = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th2) {
                strConcat = "Failed to build string from throwables: ".concat(th2.toString());
            }
        }
        throw new ptv(strConcat, (Throwable) sbpVarG.get(0), sbpVarG);
    }
}
