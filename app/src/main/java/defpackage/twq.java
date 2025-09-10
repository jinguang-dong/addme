package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twq {
    String a;
    String b;
    String c;
    String d;
    Float e;
    Float f;
    Float g;

    public twq(String str, String str2, String str3, String str4, Float f, Float f2, Float f3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
        this.f = f2;
        this.g = f3;
    }

    final boolean a(String str, String str2, String str3, String str4) {
        String str5 = this.a;
        if (str5 != null && !str5.equals(str)) {
            return false;
        }
        String str6 = this.b;
        if (str6 != null && !str6.equals(str2)) {
            return false;
        }
        String str7 = this.c;
        if (str7 != null && !str7.equals(str3)) {
            return false;
        }
        String str8 = this.d;
        return str8 == null || str8.equals(str4);
    }

    public twq(String str, String str2, String str3, String str4, float f, float f2) {
        this(str, str2, str3, str4, Float.valueOf(f), Float.valueOf(f2), null);
    }
}
