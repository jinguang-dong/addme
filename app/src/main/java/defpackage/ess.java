package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ess extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private eqi c;
    private Class d;
    private String e;
    private int f;

    public ess(String str) {
        this(str, Collections.EMPTY_LIST);
    }

    private final void c(Throwable th, List list) {
        if (!(th instanceof ess)) {
            list.add(th);
            return;
        }
        Iterator it = ((ess) th).b.iterator();
        while (it.hasNext()) {
            c((Throwable) it.next(), list);
        }
    }

    private static void d(Throwable th, Appendable appendable) throws IOException {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) throws IOException {
        d(this, appendable);
        esr esrVar = new esr(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                esrVar.append("Cause (");
                int i2 = i + 1;
                esrVar.append(String.valueOf(i2));
                esrVar.append(" of ");
                esrVar.append(String.valueOf(size));
                esrVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof ess) {
                    ((ess) th).e(esrVar);
                } else {
                    d(th, esrVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    final void b(eqi eqiVar, int i, Class cls) {
        this.c = eqiVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        sb.append(cls != null ? ", ".concat(cls.toString()) : "");
        int i = this.f;
        sb.append(i != 0 ? ", ".concat(eoz.a(i)) : "");
        eqi eqiVar = this.c;
        sb.append(eqiVar != null ? ", ".concat(eqiVar.toString()) : "");
        List<Throwable> listA = a();
        if (listA.isEmpty()) {
            return sb.toString();
        }
        if (listA.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(listA.size());
            sb.append(" root causes:");
        }
        for (Throwable th : listA) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() throws IOException {
        e(System.err);
    }

    public ess(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) throws IOException {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) throws IOException {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
