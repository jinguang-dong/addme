package defpackage;

import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jpy implements paq {
    private static final sgv b = sgv.g("jpy");
    public final jpz a;

    private jpy(jpz jpzVar) {
        this.a = jpzVar;
    }

    public static jpy d(pas pasVar, long j, int i) {
        return new jpy(new jpz(pasVar, j, i));
    }

    public final long a() {
        return TimeUnit.MICROSECONDS.convert(this.a.b, TimeUnit.NANOSECONDS);
    }

    public final void b() {
        jpz jpzVar = this.a;
        jpzVar.c.cancel(false);
        jpzVar.e.cancel(false);
        jpzVar.d.cancel(false);
    }

    public final boolean c() {
        jpz jpzVar = this.a;
        return jpzVar.c.isDone() && jpzVar.d.isDone() && jpzVar.g;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Type inference failed for: r3v3, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.jpy r8) {
        /*
            r7 = this;
            jpz r0 = r7.a
            long r1 = r8.a()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r4 = r0.b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r3 = r3.convert(r4, r6)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 <= 0) goto L7a
            jpz r8 = r8.a
            r1 = 1
            szh r0 = r0.d     // Catch: java.util.concurrent.ExecutionException -> L35
            boolean r0 = r0.isDone()     // Catch: java.util.concurrent.ExecutionException -> L35
            if (r0 != 0) goto L43
            szh r0 = r8.d     // Catch: java.util.concurrent.ExecutionException -> L35
            boolean r3 = r0.isDone()     // Catch: java.util.concurrent.ExecutionException -> L35
            if (r3 == 0) goto L43
            java.lang.Object r0 = defpackage.ske.U(r0)     // Catch: java.util.concurrent.ExecutionException -> L35
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.util.concurrent.ExecutionException -> L35
            int r0 = r0.flags     // Catch: java.util.concurrent.ExecutionException -> L35
            r0 = r0 & r1
            if (r0 == 0) goto L43
            r0 = r1
            goto L44
        L35:
            r0 = move-exception
            sgv r3 = defpackage.jpy.b
            shi r3 = r3.b()
            java.lang.String r4 = "Unexpected exception thrown while fetching values."
            r5 = 3018(0xbca, float:4.229E-42)
            defpackage.mn.c(r4, r5, r3, r0)
        L43:
            r0 = r2
        L44:
            if (r0 == 0) goto L59
            sgv r3 = defpackage.jpy.b
            shi r3 = r3.c()
            r4 = 3017(0xbc9, float:4.228E-42)
            shi r3 = r3.M(r4)
            sgt r3 = (defpackage.sgt) r3
            java.lang.String r4 = "Stale encoder frame detected"
            r3.s(r4)
        L59:
            szh r8 = r8.c
            boolean r8 = r8.isDone()
            if (r8 == 0) goto L6b
            jpz r8 = r7.a
            szh r8 = r8.c
            boolean r8 = r8.isDone()
            if (r8 == 0) goto L79
        L6b:
            jpz r7 = r7.a
            szh r7 = r7.e
            boolean r7 = r7.isCancelled()
            if (r7 != 0) goto L79
            if (r0 == 0) goto L78
            goto L79
        L78:
            return r2
        L79:
            return r1
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpy.e(jpy):boolean");
    }

    public final String toString() {
        Locale locale = Locale.US;
        jpz jpzVar = this.a;
        return String.format(locale, yoGAhrpjU.AkPUsCkamY, Long.valueOf(jpzVar.b), Boolean.valueOf(jpzVar.c.isDone()), Boolean.valueOf(jpzVar.d.isDone()), Boolean.valueOf(jpzVar.g));
    }
}
