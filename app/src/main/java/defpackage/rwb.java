package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwb {
    public boolean a;
    private final String b;
    private final rwa c;
    private rwa d;

    public rwb(String str) {
        rwa rwaVar = new rwa();
        this.c = rwaVar;
        this.d = rwaVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final rwa g() {
        rwa rwaVar = new rwa();
        this.d.c = rwaVar;
        this.d = rwaVar;
        return rwaVar;
    }

    public final void a(Object obj) {
        g().b = obj;
    }

    public final void b(String str, Object obj) {
        rwa rwaVarG = g();
        rwaVarG.b = obj;
        rwaVarG.a = str;
    }

    public final void c(String str, Object obj) {
        rvz rvzVar = new rvz();
        this.d.c = rvzVar;
        this.d = rvzVar;
        rvzVar.b = obj;
        rvzVar.a = str;
    }

    public final void d(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (rwa rwaVar = this.c.c; rwaVar != null; rwaVar = rwaVar.c) {
            boolean z2 = rwaVar instanceof rvz;
            Object obj = rwaVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = rwaVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
