package defpackage;

import com.google.ar.core.R;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class flf implements fko {
    private static final sgv a = sgv.g("flf");
    private qkt b = new fle(FloatBuffer.allocate(0));
    private long c = 0;
    private final qkl d;
    private final obu e;

    public flf(qin qinVar, fkw fkwVar) {
        obu obuVar = (obu) fkwVar.a(qinVar);
        this.e = obuVar;
        this.d = obuVar.t(R.raw.point_cloud_vert, R.raw.point_cloud_frag);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: fnv | fnz -> 0x0055, fnv | fnz -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #2 {fnv | fnz -> 0x0055, blocks: (B:2:0x0000, B:10:0x002d, B:10:0x002d, B:23:0x0054, B:23:0x0054, B:22:0x0051, B:22:0x0051), top: B:45:0x0000 }] */
    /* JADX WARN: Type inference failed for: r9v2, types: [sgt, shi] */
    @Override // defpackage.fko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.fon r8, defpackage.tfn r9, float[] r10, defpackage.qjn r11, defpackage.qim r12) {
        /*
            r7 = this;
            fov r8 = r8.d()     // Catch: java.lang.Throwable -> L55
            java.nio.FloatBuffer r9 = r8.c()     // Catch: java.lang.Throwable -> L47
            int r9 = r9.limit()     // Catch: java.lang.Throwable -> L47
            r11 = 4
            if (r9 < r11) goto L31
            long r0 = r8.b()     // Catch: java.lang.Throwable -> L47
            long r2 = r7.c     // Catch: java.lang.Throwable -> L47
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 > 0) goto L1a
            goto L31
        L1a:
            fle r9 = new fle     // Catch: java.lang.Throwable -> L47
            java.nio.FloatBuffer r11 = r8.c()     // Catch: java.lang.Throwable -> L47
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L47
            r7.b = r9     // Catch: java.lang.Throwable -> L47
            long r0 = r8.b()     // Catch: java.lang.Throwable -> L47
            r7.c = r0     // Catch: java.lang.Throwable -> L47
            if (r8 == 0) goto L64
        L2d:
            r8.close()     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55
            goto L64
        L31:
            sgv r9 = defpackage.flf.a     // Catch: java.lang.Throwable -> L47
            shi r9 = r9.c()     // Catch: java.lang.Throwable -> L47
            r11 = 254(0xfe, float:3.56E-43)
            shi r9 = r9.M(r11)     // Catch: java.lang.Throwable -> L47
            sgt r9 = (defpackage.sgt) r9     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = "Missing point cloud data, not updating point cloud data."
            r9.s(r11)     // Catch: java.lang.Throwable -> L47
            if (r8 == 0) goto L64
            goto L2d
        L47:
            r0 = move-exception
            r9 = r0
            if (r8 == 0) goto L54
            r8.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55
        L54:
            throw r9     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L55
        L55:
            r0 = move-exception
            r8 = r0
            sgv r9 = defpackage.flf.a
            shi r9 = r9.c()
            java.lang.String r11 = "Too slow, not updating point cloud data."
            r0 = 255(0xff, float:3.57E-43)
            defpackage.mn.c(r11, r0, r9, r8)
        L64:
            qkt r8 = r7.b
            int r9 = r8.c
            if (r9 != 0) goto L6b
            return
        L6b:
            obu r9 = r7.e
            r11 = 1
            qkt[] r11 = new defpackage.qkt[r11]
            r0 = 0
            r11[r0] = r8
            qkr r8 = r9.r(r11)
            tym r9 = defpackage.qji.n(r0, r8)     // Catch: java.lang.Throwable -> Lc6
            qkl r7 = r7.d     // Catch: java.lang.Throwable -> Lc6
            qji r1 = r9.a(r7)     // Catch: java.lang.Throwable -> Lc6
            qhv r7 = r12.e()     // Catch: java.lang.Throwable -> Lc6
            qhx r7 = (defpackage.qhx) r7     // Catch: java.lang.Throwable -> Lc6
            qfq r7 = r7.a     // Catch: java.lang.Throwable -> Lc6
            int r7 = r7.b()     // Catch: java.lang.Throwable -> Lc6
            qhv r9 = r12.e()     // Catch: java.lang.Throwable -> Lc6
            qhx r9 = (defpackage.qhx) r9     // Catch: java.lang.Throwable -> Lc6
            qfq r9 = r9.a     // Catch: java.lang.Throwable -> Lc6
            int r9 = r9.a()     // Catch: java.lang.Throwable -> Lc6
            r1.k(r0, r0, r7, r9)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "u_Color"
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.j(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = "u_PointSize"
            r9 = 1084227584(0x40a00000, float:5.0)
            r1.f(r7, r9)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = "u_ModelViewProjection"
            java.lang.Object r9 = r10.clone()     // Catch: java.lang.Throwable -> Lc6
            float[] r9 = (float[]) r9     // Catch: java.lang.Throwable -> Lc6
            r1.g(r7, r9)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r7 = "a_Position"
            r1.c(r7, r0)     // Catch: java.lang.Throwable -> Lc6
            r1.a(r12)     // Catch: java.lang.Throwable -> Lc6
            r8.close()
            return
        Lc6:
            r0 = move-exception
            r7 = r0
            r8.close()     // Catch: java.lang.Throwable -> Lcc
            goto Ld1
        Lcc:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        Ld1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flf.a(fon, tfn, float[], qjn, qim):void");
    }

    @Override // defpackage.fko, defpackage.paq, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }
}
