package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class trv {
    public static final tru a;
    public static final boolean b;
    public static final boolean c;
    static final long d;
    public static final long e;
    static final boolean f;
    private static final Unsafe g;
    private static final Class h;
    private static final boolean i;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    static {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trv.<clinit>():void");
    }

    private trv() {
    }

    private static void A(Class cls) {
        if (c) {
            a.a.arrayIndexScale(cls);
        }
    }

    static byte a(long j) {
        return a.a(j);
    }

    static double b(Object obj, long j) {
        return a.b(obj, j);
    }

    static float c(Object obj, long j) {
        return a.c(obj, j);
    }

    static int d(Object obj, long j) {
        return a.j(obj, j);
    }

    static long e(Object obj, long j) {
        return a.k(obj, j);
    }

    static Object f(Class cls) {
        try {
            return g.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object g(Object obj, long j) {
        return a.a.getObject(obj, j);
    }

    public static Field h() {
        Field fieldZ = z(Buffer.class, "effectiveDirectAddress");
        if (fieldZ != null) {
            return fieldZ;
        }
        Field fieldZ2 = z(Buffer.class, "address");
        if (fieldZ2 == null || fieldZ2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZ2;
    }

    static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new trr());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(Throwable th) {
        Logger.getLogger(trv.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void k(Object obj, long j, boolean z) {
        a.d(obj, j, z);
    }

    static void l(byte[] bArr, long j, byte b2) {
        a.e(bArr, d + j, b2);
    }

    public static void m(Object obj, long j, byte b2) {
        int i2 = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i3 = (b2 & 255) << i2;
        q(obj, j2, i3 | ((~(255 << i2)) & d(obj, j2)));
    }

    public static void n(Object obj, long j, byte b2) {
        int i2 = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i3 = (b2 & 255) << i2;
        q(obj, j2, i3 | ((~(255 << i2)) & d(obj, j2)));
    }

    static void o(Object obj, long j, double d2) {
        a.f(obj, j, d2);
    }

    static void p(Object obj, long j, float f2) {
        a.g(obj, j, f2);
    }

    static void q(Object obj, long j, int i2) {
        a.l(obj, j, i2);
    }

    static void r(Object obj, long j, long j2) {
        a.m(obj, j, j2);
    }

    public static void s(Object obj, long j, Object obj2) {
        a.a.putObject(obj, j, obj2);
    }

    static boolean u(Object obj, long j) {
        return a.h(obj, j);
    }

    public static boolean v(Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static boolean w(Object obj, long j) {
        return ((byte) ((d(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    static void x(long j, byte[] bArr, long j2) {
        a.i(j, bArr, j2);
    }

    private static int y(Class cls) {
        if (c) {
            return a.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static Field z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean t(Class cls) {
        try {
            Class cls2 = h;
            cls2.getMethod(mNLbzhCxd.Rolr, cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
