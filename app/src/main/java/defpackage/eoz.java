package defpackage;

import android.text.TextUtils;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eoz {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "FINISHED" : "ENCODE" : "SOURCE" : "DATA_CACHE" : "RESOURCE_CACHE" : "INITIALIZE";
    }

    public static pen c() {
        pem pemVarA = pen.a();
        pemVarA.c(4);
        pemVarA.b(2);
        pemVarA.e(1);
        return pemVarA.a();
    }

    public static pen d() {
        pem pemVarA = pen.a();
        pemVarA.c(1);
        pemVarA.b(2);
        pemVarA.e(1);
        return pemVarA.a();
    }

    public static pen e() {
        pem pemVarA = pen.a();
        pemVarA.c(4);
        pemVarA.b(1);
        pemVarA.e(1);
        return pemVarA.a();
    }

    public static pen f() {
        pem pemVarA = pen.a();
        pemVarA.c(3);
        pemVarA.b(3);
        pemVarA.e(1);
        return pemVarA.a();
    }

    public static void g(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void i(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void k(Object obj) {
        j(obj, "Argument must not be null");
    }
}
