package defpackage;

import androidx.wear.ambient.AmbientLifecycleObserverKt;
import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class raq {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public raq() {
        throw null;
    }

    public static void a(edw edwVar, String str) {
        eex eexVar = new eex();
        eexVar.x(true);
        edwVar.d("http://ns.google.com/photos/1.0/container/", str, null, eexVar);
    }

    public static Object b(Object obj) {
        return obj == null ? "0" : obj;
    }

    public static void d(Object obj, String str) throws edv {
        if (obj == null) {
            throw new edv("Missing value for ".concat(str), 5);
        }
    }

    public static void e(edw edwVar, String str, String str2, String str3) {
        edwVar.c("http://ns.google.com/photos/1.0/container/", str.concat(AmbientLifecycleObserverKt.G("http://ns.google.com/photos/1.0/container/item/", str2)), str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof raq) {
            raq raqVar = (raq) obj;
            if (this.a.equals(raqVar.a) && this.b.equals(raqVar.b) && this.c == raqVar.c && this.d == raqVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }

    public raq(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public static String c(edw edwVar, String str, String str2) throws edv {
        String str3 = wzgaYJqO.KVjbJVkYtWOQLYr;
        eez eezVarA = edwVar.a(str3, str + AmbientLifecycleObserverKt.G(str3, "Item") + AmbientLifecycleObserverKt.G("http://ns.google.com/photos/1.0/container/item/", str2));
        if (eezVarA == null) {
            return null;
        }
        return ((eej) eezVarA).a.toString();
    }
}
