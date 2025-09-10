package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class oan {
    public final oar b;

    protected oan(oar oarVar) {
        this.b = oarVar;
    }

    private static String a(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    protected static String l(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String strA = a(obj);
        String strA2 = a(obj2);
        String strA3 = a(obj3);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    public static final void x() {
    }

    public final Context d() {
        return this.b.a;
    }

    protected final oak e() {
        return this.b.a();
    }

    public final oam f() {
        return this.b.b();
    }

    protected final obc g() {
        return this.b.c;
    }

    protected final obf h() {
        obf obfVar = this.b.e;
        oar.f(obfVar);
        return obfVar;
    }

    protected final obm i() {
        return this.b.d();
    }

    public final obq j() {
        obq obqVar = this.b.f;
        oar.f(obqVar);
        return obqVar;
    }

    protected final obw k() {
        return this.b.e();
    }

    public final void m(String str, Object obj) {
        w(3, str, obj, null, null);
    }

    public final void n(String str) {
        w(6, str, null, null, null);
    }

    public final void o(String str, Object obj) {
        w(6, str, obj, null, null);
    }

    public final void p(String str, Object obj, Object obj2) {
        w(6, str, obj, obj2, null);
    }

    public final void q(String str) {
        w(2, str, null, null, null);
    }

    public final void r(String str, Object obj) {
        w(2, str, obj, null, null);
    }

    public final void s(String str, Object obj, Object obj2) {
        w(2, str, obj, obj2, null);
    }

    public final void t(String str) {
        w(5, str, null, null, null);
    }

    public final void u(String str, Object obj) {
        w(5, str, obj, null, null);
    }

    public final void v(String str, Object obj, Object obj2) {
        w(5, str, obj, obj2, null);
    }

    public final void w(int i, String str, Object obj, Object obj2, Object obj3) {
        obm obmVar = this.b.d;
        if (obmVar == null) {
            String str2 = (String) obh.b.f();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, l(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) obh.b.f();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, obm.l(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            obmVar.c(i, str, obj, obj2, obj3);
        }
    }

    public final void y() {
    }
}
