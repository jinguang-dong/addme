package defpackage;

import android.util.Log;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyc {
    public final cwh a;
    public final cyg b;

    public cyc() {
        throw null;
    }

    public static cyc a(cwh cwhVar) {
        return new cyc(cwhVar, ((cxt) cwhVar).getViewModelStore$ar$class_merging());
    }

    public static boolean b(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    @Deprecated
    public final void c(String str, PrintWriter printWriter) {
        aab aabVar = this.b.b;
        if (aabVar.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String strValueOf = String.valueOf(str);
            for (int i = 0; i < aabVar.c(); i++) {
                String strConcat = strValueOf.concat("    ");
                cyd cydVar = (cyd) aabVar.e(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(aabVar.b(i));
                printWriter.print(": ");
                printWriter.println(cydVar.toString());
                printWriter.print(strConcat);
                printWriter.print("mId=");
                printWriter.print(cydVar.j);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(strConcat);
                printWriter.print("mLoader=");
                cyj cyjVar = cydVar.k;
                printWriter.println(cyjVar);
                String strConcat2 = strConcat.concat("  ");
                printWriter.print(strConcat2);
                printWriter.print("mId=");
                printWriter.print(cyjVar.d);
                printWriter.print(" mListener=");
                printWriter.println(cyjVar.j);
                if (cyjVar.f || cyjVar.i) {
                    printWriter.print(strConcat2);
                    printWriter.print("mStarted=");
                    printWriter.print(cyjVar.f);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(cyjVar.i);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (cyjVar.g || cyjVar.h) {
                    printWriter.print(strConcat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(cyjVar.g);
                    printWriter.print(" mReset=");
                    printWriter.println(cyjVar.h);
                }
                cyi cyiVar = (cyi) cyjVar;
                if (cyiVar.a != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mTask=");
                    printWriter.print(cyiVar.a);
                    printWriter.print(" waiting=");
                    boolean z = cyiVar.a.a;
                    printWriter.println(false);
                }
                if (cyiVar.b != null) {
                    printWriter.print(strConcat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(cyiVar.b);
                    printWriter.print(" waiting=");
                    boolean z2 = cyiVar.b.a;
                    printWriter.println(false);
                }
                if (cydVar.l != null) {
                    printWriter.print(strConcat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cydVar.l);
                    cye cyeVar = cydVar.l;
                    printWriter.print(strConcat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(cyeVar.b);
                }
                printWriter.print(strConcat);
                printWriter.print("mData=");
                printWriter.println(cyj.e(cydVar.a()));
                printWriter.print(strConcat);
                printWriter.print("mStarted=");
                printWriter.println(cydVar.d > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        cwh cwhVar = this.a;
        sb.append(cwhVar.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cwhVar)));
        sb.append("}}");
        return sb.toString();
    }

    public cyc(cwh cwhVar, cxb cxbVar) {
        this.a = cwhVar;
        cxp cxpVar = cyg.a;
        cxw cxwVar = cxw.a;
        cxwVar.getClass();
        this.b = (cyg) cxs.a(cyg.class, new gno(cxbVar, cxpVar, cxwVar));
    }
}
