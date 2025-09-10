package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbu {
    public static final /* synthetic */ int a = 0;
    private static final Random b = new Random();

    public static boolean a(long j) {
        if (j > 0) {
            return b.nextLong() % j == 0;
        }
        if (j < 0) {
            c("Bad sample interval: %d", Long.valueOf(j));
        }
        return false;
    }

    public static void b(String str) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.b().M(5657)).v("%s", str);
        sgvVar.b().Q();
    }

    public static void c(String str, Object obj) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.b().M(5658)).v(str, obj);
        sgvVar.b().Q();
    }

    public static void d(String str, Object obj, Object obj2) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.b().M(5659)).E(str, obj, obj2);
        sgvVar.b().Q();
    }

    public static void e(String str, Object... objArr) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.b().M(5660)).J(str, objArr);
        sgvVar.b().Q();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [sgt, shi] */
    public static void f(Throwable th, String str) {
        sgv sgvVar = qbt.a;
        ((sgt) ((sgt) sgvVar.b().i(th)).M((char) 5661)).v("%s", str);
        sgvVar.b().Q();
    }

    public static void g(Throwable th, String str, Object... objArr) {
        sgv sgvVar = qbt.a;
        ((sgt) ((sgt) sgvVar.b().i(th)).M(5662)).J(str, objArr);
        sgvVar.b().Q();
    }

    public static void h(String str, Object obj) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.c().M(5667)).v(str, obj);
        sgvVar.c().Q();
    }

    public static void i(String str, Object obj, Object obj2) {
        sgv sgvVar = qbt.a;
        ((sgt) sgvVar.c().M(5668)).E(str, obj, obj2);
        sgvVar.c().Q();
    }

    public static void j(Throwable th, String str, Object... objArr) {
        sgv sgvVar = qbt.a;
        ((sgt) ((sgt) sgvVar.c().i(th)).M(5670)).J(str, objArr);
        sgvVar.c().Q();
    }
}
