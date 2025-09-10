package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hbj {
    public static final hbc a = hbc.RELEASE;
    public final Map b = new HashMap();
    public final hbh c;

    public hbj(pnq pnqVar, pnp pnpVar, lwq lwqVar, cxb cxbVar, hbh hbhVar) {
        int i;
        int i2;
        this.c = hbhVar;
        hbc hbcVar = a;
        qpt.ce("ProcessStablePhInit#GcaConfig", (Context) cxbVar.a);
        cxb.K(pnqVar, this, this, hbcVar, pnpVar);
        if (pnqVar.i()) {
            ezh.aj(this, this, pnqVar, hbcVar, lwqVar);
            i = 2;
            i2 = 3;
        } else {
            i = 2;
            i2 = 3;
            if (pnqVar.p) {
                g(gyg.f, Float.valueOf(1.3229325E7f));
                g(gyg.g, Float.valueOf(3.807744E7f));
                l(gzo.aU, true);
                l(gzo.bb, true);
                c(gzo.l, 1000);
                l(gzo.ac, true);
                l(gzo.ad, true);
                g(gzo.bk, Float.valueOf(1.580689f));
                j(gzo.am, true);
                l(gzo.bs, true);
                l(gzo.ai, false);
                j(gzo.bt, false);
                l(gzo.aK, true);
                l(gzo.bd, true);
                l(gze.g, true);
                g(gze.b, Float.valueOf(1.0f));
                l(gze.h, true);
                l(gze.n, false);
                l(has.d, false);
                l(gyv.e, false);
                l(haz.b, false);
                l(gzb.b, true);
                l(gzb.c, true);
                l(gzb.d, true);
                l(gym.E, false);
                l(gym.af, false);
                l(gym.ag, true);
                l(gym.Q, false);
                l(gym.K, true);
                l(gym.R, true);
                l(gym.S, true);
                l(gym.T, true);
                l(gym.V, true);
                l(gym.W, true);
                l(gym.Y, false);
                l(gzo.Q, false);
                l(gym.ai, false);
                l(gym.Z, true);
                c(gym.k, 158);
                l(gzs.at, true);
                j(gzs.Y, false);
                l(gzs.aU, true);
                g(gzs.Z, Float.valueOf(999.0f));
                l(gzs.ar, true);
                l(gze.i, true);
                boolean zB = lwqVar.b();
                j(gzz.h, false);
                l(gzz.l, false);
                l(gzz.x, true);
                l(gzz.w, zB);
                l(haa.A, true);
                l(haa.aa, true);
                l(haa.W, true);
                l(haa.ab, true);
                l(haa.B, true);
                l(haa.Y, true);
                l(haa.o, true);
                l(haa.q, true);
                l(haa.D, true);
                l(haa.Z, true);
                l(haa.aj, true);
                c(hae.b, Integer.valueOf(((Integer) a(hae.c).get()).intValue() * 4));
                l(hae.k, false);
                l(hae.l, true);
                l(gzs.ab, true);
                l(hak.v, true);
                l(hak.F, true);
                l(hak.p, true);
                l(hak.q, true);
                l(hak.J, false);
                if (hbcVar.b(hbc.FISHFOOD)) {
                    l(hak.I, false);
                }
                h(hak.M, "2c51b285d81a44d7a619538fe13cb421/2c51b285d81a44d7a619538fe13cb421.uncompressed");
                h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
                l(hak.s, false);
                l(hak.t, true);
                h(hak.u, "P21");
                l(gzo.Z, true);
                g(hba.l, Float.valueOf(0.600913f));
                g(hba.j, Float.valueOf(7.0f));
                l(hba.h, true);
                l(gyx.b, false);
                l(gyx.c, true);
                l(gyx.d, false);
                l(gyx.e, true);
                h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_pixel6.tflite.uncompressed");
                l(gyx.i, true);
                l(gzs.aK, false);
                l(gys.d, true);
                h(haq.f, "avenh-model0-abrolhos.tflite.uncompressed");
                l(gyw.j, true);
                l(gze.d, false);
                l(gzs.O, true);
                h(gzs.P, "lancet-p21.tflite.uncompressed");
                l(gyo.f, true);
                l(haa.w, true);
                l(gzs.D, false);
                l(gzs.E, false);
                gzg gzgVar = gyg.h;
                hbc hbcVar2 = hbc.DOGFOOD;
                l(gzgVar, hbcVar.b(hbcVar2));
                l(gyg.i, hbcVar.b(hbcVar2));
                l(gyg.j, hbcVar.b(hbcVar2));
                l(gzs.aP, false);
            } else if (pnqVar.o) {
                g(gyg.f, Float.valueOf(1.3229325E7f));
                g(gyg.g, Float.valueOf(3.807744E7f));
                l(gzo.aU, true);
                l(gzo.bb, true);
                c(gzo.l, 1400);
                g(gzo.bk, Float.valueOf(1.580689f));
                j(gzo.am, true);
                l(gzo.ac, true);
                l(gzo.ad, true);
                l(gzo.br, false);
                l(gza.b, true);
                l(gza.c, true);
                l(gzo.bs, true);
                l(gza.f, true);
                l(gza.t, true);
                l(gzo.bd, true);
                l(gze.g, true);
                g(gze.b, Float.valueOf(1.0f));
                l(gze.h, true);
                l(gze.n, false);
                l(has.d, false);
                l(gzb.b, true);
                l(gyv.e, false);
                l(gzb.c, true);
                l(gzb.d, true);
                l(gym.af, true);
                l(gym.ag, true);
                l(gym.Q, true);
                l(gym.K, true);
                l(gym.R, true);
                l(gym.S, true);
                l(gym.T, true);
                l(gym.V, true);
                l(gym.W, true);
                l(gym.Y, false);
                gzg gzgVar2 = gym.y;
                Float fValueOf = Float.valueOf(7.0f);
                g(gzgVar2, fValueOf);
                g(gym.z, fValueOf);
                g(gym.A, fValueOf);
                g(gym.x, fValueOf);
                l(gzo.Q, false);
                l(gym.Z, true);
                l(gym.ac, true);
                c(gym.k, 158);
                l(gzs.ab, true);
                l(gzs.aU, true);
                l(gzs.aB, false);
                l(hab.d, true);
                l(hab.e, true);
                l(hab.f, true);
                l(hab.g, true);
                l(gze.i, true);
                g(gzs.Z, Float.valueOf(999.0f));
                l(gzw.e, true);
                boolean zB2 = lwqVar.b();
                j(gzz.h, false);
                l(gzz.l, false);
                l(gzz.x, true);
                l(gzz.w, zB2);
                l(haa.A, true);
                l(haa.aa, true);
                l(haa.W, true);
                l(haa.ab, true);
                l(haa.B, true);
                l(haa.Y, true);
                l(haa.o, true);
                l(haa.q, true);
                l(haa.D, true);
                l(haa.Z, true);
                c(hae.b, Integer.valueOf(((Integer) a(hae.c).get()).intValue() * (true == pnqVar.o ? 5 : 4)));
                c(hae.a, 300);
                l(hae.k, false);
                l(hae.l, true);
                l(hak.v, true);
                l(hak.F, true);
                l(hak.G, true);
                l(hak.p, true);
                l(hak.q, true);
                l(hak.J, false);
                hbc hbcVar3 = hbc.FISHFOOD;
                if (hbcVar.b(hbcVar3)) {
                    l(hak.I, false);
                }
                h(hak.M, "2c51b285d81a44d7a619538fe13cb421/2c51b285d81a44d7a619538fe13cb421.uncompressed");
                h(hak.U, "518658ef4ea04adf8e19e64d5aa019d0/518658ef4ea04adf8e19e64d5aa019d0.uncompressed");
                l(gzo.Z, true);
                l(hba.h, true);
                l(gyx.b, hbcVar.b(hbcVar3));
                l(gyx.d, true);
                l(gyx.e, true);
                l(gzc.j, true);
                l(gzc.x, true);
                l(gzs.aK, false);
                l(gys.d, true);
                l(gza.d, true);
                l(gyw.j, true);
                l(gze.d, false);
                l(gzs.aP, false);
                l(gzs.D, false);
                l(gzs.E, false);
            } else if (pnqVar.l()) {
                g(gyg.f, Float.valueOf(1.3229325E7f));
                g(gyg.g, Float.valueOf(3.807744E7f));
                c(gzo.l, 1000);
                l(gzo.ac, true);
                l(gzo.ad, true);
                g(gzo.bk, Float.valueOf(1.580689f));
                j(gzo.am, true);
                l(gzo.bs, true);
                l(gzo.ai, false);
                l(gzo.aX, true);
                l(gzo.aY, false);
                l(gzo.U, false);
                l(gzo.bd, true);
                l(gzo.bq, true);
                l(gze.g, true);
                l(gze.h, true);
                l(gze.n, false);
                l(gyv.e, false);
                l(haz.b, false);
                l(gzb.b, true);
                l(gzb.c, true);
                l(gzb.d, true);
                l(gym.C, false);
                l(gym.E, false);
                l(gym.F, false);
                l(gym.H, false);
                l(gym.an, false);
                l(gym.ap, false);
                l(gym.af, false);
                l(gym.ag, false);
                l(gym.Q, false);
                l(gym.V, true);
                l(gym.W, true);
                l(gym.Y, false);
                l(gzo.Q, false);
                l(gym.Z, true);
                l(gyx.b, true);
                l(gyx.c, true);
                l(gyx.f, true);
                l(gyx.e, true);
                h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op.tflite.uncompressed");
                l(gyx.i, true);
                h(has.g, "siamese_fe_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
                h(has.h, "siamese_end2end_darwinn_custom_op_janeiro_a0.tflite.uncompressed");
                l(has.d, false);
                l(gzs.ab, true);
                l(gzs.at, true);
                j(gzs.Y, false);
                l(gzs.aU, true);
                l(gze.i, true);
                boolean zB3 = lwqVar.b();
                j(gzz.h, false);
                l(gzz.l, false);
                l(gzz.x, true);
                l(gzz.w, zB3);
                l(haa.A, true);
                l(haa.aa, true);
                l(haa.W, true);
                l(haa.ab, true);
                l(haa.B, true);
                l(haa.Y, true);
                l(haa.o, true);
                l(haa.q, true);
                l(haa.D, true);
                l(haa.Z, true);
                c(hae.b, Integer.valueOf(((Integer) a(hae.c).get()).intValue() * 4));
                l(hae.k, false);
                l(hae.l, true);
                l(haf.b, false);
                l(haf.a, true);
                l(hak.h, false);
                l(hak.v, true);
                l(hak.p, true);
                if (hbcVar.b(hbc.FISHFOOD)) {
                    l(hak.I, false);
                }
                h(hak.M, "92f5e8432ca24f838c3fd894a2ff8b0b/92f5e8432ca24f838c3fd894a2ff8b0b.uncompressed");
                l(hak.t, true);
                h(hak.u, "P22");
                l(hak.s, false);
                l(hba.h, true);
                l(hab.d, true);
                l(hab.e, false);
                l(hab.f, true);
                l(hab.g, true);
                l(hab.h, true);
                h(hab.i, "motion-custom_op-p22.tflite.uncompressed");
                h(hab.j, "saliency-custom_op-p22.tflite.uncompressed");
                h(haq.f, "avenh-model0-janeiro.tflite.uncompressed");
                l(gzs.O, true);
                h(gzs.P, "lancet-p22.tflite.uncompressed");
                g(gzs.Z, Float.valueOf(999.0f));
                l(gzs.au, true);
                h(gzs.aw, "pecan-p22-custom_op.tflite.uncompressed");
                l(gzs.aK, false);
                l(gyw.j, true);
                l(gzo.aE, false);
                l(gzo.bm, false);
                l(hac.K, false);
                l(hac.T, false);
                l(gyo.f, true);
                l(haa.w, true);
                l(hba.k, true);
                l(gzs.aP, false);
            } else if (pnqVar.c()) {
                ezh.q(this, this, pnqVar, pnpVar, hbcVar, lwqVar);
            } else if (pnqVar.t) {
                ezh.n(this, this, hbcVar, lwqVar);
            } else if (pnqVar.u) {
                ezh.o(this, this, lwqVar);
            } else if (pnqVar.o()) {
                gyq.a(this, this, pnqVar, hbcVar);
            } else if (pnqVar.x) {
                ezh.r(this, this, hbcVar, lwqVar);
            } else if (pnqVar.f()) {
                gsn.p(this, this, pnqVar, hbcVar);
            } else if (pnqVar.B) {
                ezh.p(this, this, hbcVar, lwqVar);
            } else if (pnqVar.C) {
                g(gyg.f, Float.valueOf(1.3229325E7f));
                g(gyg.g, Float.valueOf(3.807744E7f));
                l(gzo.aU, true);
                l(gzo.bb, true);
                c(gzo.l, 1400);
                l(gzo.ac, true);
                l(gzo.ad, true);
                g(gzo.bk, Float.valueOf(1.580689f));
                j(gzo.am, true);
                l(gzo.bs, true);
                j(gzo.bt, false);
                j(gzo.bA, false);
                l(gzo.ai, false);
                l(gzo.bd, true);
                g(hba.n, Float.valueOf(5.0f));
                g(hba.l, Float.valueOf(0.550078f));
                gzg gzgVar3 = hba.o;
                Float fValueOf2 = Float.valueOf(8.0f);
                g(gzgVar3, fValueOf2);
                l(hba.i, true);
                g(hba.j, fValueOf2);
                l(gze.g, true);
                g(gze.b, Float.valueOf(1.0f));
                l(gze.h, true);
                l(gze.n, false);
                l(gyv.d, true);
                l(gzb.b, true);
                l(gzb.c, true);
                l(gzb.d, true);
                l(gym.E, false);
                l(gym.at, true);
                l(gym.ag, true);
                l(gym.K, true);
                l(gym.R, true);
                l(gym.S, true);
                l(gym.T, true);
                l(gym.V, true);
                l(gym.W, true);
                l(gym.Y, false);
                l(gym.ah, true);
                l(gym.ai, false);
                l(gzo.Q, false);
                l(gym.H, false);
                l(gym.aj, false);
                c(gym.k, 171);
                l(gzs.at, true);
                l(gzs.F, false);
                l(hac.r, true);
                l(hac.q, true);
                l(gzs.ae, true);
                l(hac.L, true);
                l(gzo.bD, true);
                l(gze.i, true);
                boolean zB4 = lwqVar.b();
                j(gzz.h, false);
                l(gzz.l, false);
                l(gzz.x, true);
                l(gzz.w, zB4);
                l(haa.A, true);
                l(haa.aa, true);
                l(haa.W, true);
                l(haa.ab, true);
                l(haa.B, true);
                l(haa.Y, true);
                l(gyg.i, true);
                l(gyg.j, true);
                l(haa.o, true);
                l(haa.q, true);
                l(haa.D, true);
                l(haa.Z, true);
                l(haa.aj, true);
                l(gyf.c, true);
                l(gyf.e, true);
                c(hae.b, Integer.valueOf(((Integer) a(hae.c).get()).intValue() * 4));
                l(hae.k, false);
                l(hae.l, true);
                l(hae.x, true);
                l(hak.w, true);
                l(hak.v, true);
                l(hak.F, true);
                l(hak.G, true);
                g(hak.d, Float.valueOf(1.4881f));
                l(hak.Z, true);
                g(hak.X, Float.valueOf(3.0f));
                l(hak.p, true);
                l(hak.q, true);
                l(hak.ad, true);
                l(hak.ae, true);
                l(hak.aa, true);
                l(hak.A, true);
                l(hak.K, true);
                l(hak.L, true);
                h(hak.M, "dd674d048bbc43c1b338a6692cf9c481/dd674d048bbc43c1b338a6692cf9c481.uncompressed");
                h(hak.P, "a3a43595f3aa49b3b4ab6ff4bb63de83/a3a43595f3aa49b3b4ab6ff4bb63de83.uncompressed");
                h(hak.S, "efaffa0bfaf74be2ad2e17aeff79f3db/efaffa0bfaf74be2ad2e17aeff79f3db.uncompressed");
                h(hak.T, "a982533a4222473db9f191c212a99740/a982533a4222473db9f191c212a99740.uncompressed");
                h(hak.U, "f452199b34d445868df25db5b960f191/f452199b34d445868df25db5b960f191.uncompressed");
                c(gyk.b, 2104);
                c(gyk.c, 1560);
                c(gyk.a, 0);
                l(hak.s, false);
                l(hak.t, true);
                h(hak.u, "P23");
                l(haw.l, true);
                l(haw.n, true);
                l(haw.o, true);
                l(haw.v, true);
                l(haw.q, true);
                l(haw.w, true);
                l(gzo.Z, true);
                l(hba.g, false);
                l(hba.h, true);
                l(gyx.b, true);
                l(gyx.c, true);
                l(gyx.f, true);
                l(gyx.e, true);
                l(gyx.g, true);
                h(gyx.h, "deeprestore_face_float32_512x512_v13_rc2_float-graph-custom_op_p23.tflite.uncompressed");
                h(has.g, "siamese_fe_darwinn_custom_op_rio_a0.tflite.uncompressed");
                h(has.h, "siamese_end2end_darwinn_custom_op_rio_a0.tflite.uncompressed");
                l(gys.d, true);
                l(gzc.j, true);
                l(gzc.x, true);
                c(gzc.g, 2);
                l(gzs.ab, true);
                l(hab.d, true);
                l(hab.e, false);
                l(hab.f, true);
                l(hab.g, true);
                l(hab.h, true);
                h(hab.i, "motion-custom_op-p23.tflite.uncompressed");
                h(hab.j, "saliency-custom_op-p23.tflite.uncompressed");
                h(haq.f, "avenh-model0-rio.tflite.uncompressed");
                gzi gziVar = hau.a;
                l(gyw.j, true);
                l(gzs.O, true);
                l(gzs.Q, true);
                h(gzs.P, "lancet_alpha_v2-p24.tflite.uncompressed");
                l(gzs.R, true);
                h(gzs.S, "kepler_v2/p24");
                l(gzs.au, true);
                l(gzs.az, false);
                h(gzs.aw, CGlJpiVWrCQOq.wVfY);
                l(gzs.av, true);
                h(gzs.ay, "pecan-p24-pie-custom_op.tflite.uncompressed");
                l(gzs.aA, true);
                h(gzs.ax, nWEkBGOQPWQp.OCSiZrP);
                h(gzs.aL, "walnut-p23-custom_op.tflite.uncompressed");
                c(gzs.g, 2);
                g(gzs.ak, Float.valueOf(100.0f));
                l(gzs.aj, true);
                l(gyo.f, true);
                l(haa.w, true);
                l(gzs.aO, true);
                l(hai.b, false);
                l(gzs.aF, true);
                l(gzs.H, true);
                j(gyi.h, true);
                l(gzp.k, true);
                g(gzp.n, Float.valueOf(0.75f));
                l(gzs.aM, true);
                h(gzs.aN, "almond-p24-custom_op.tflite.uncompressed");
                l(gzy.j, true);
                l(gzy.k, true);
                l(gzy.l, true);
                l(gzy.p, true);
                l(gzy.q, true);
                c(gzy.e, 1);
                c(gzy.d, 10);
            } else if (pnqVar.a) {
                l(gzo.aU, true);
                l(gzo.bb, true);
                l(gzo.bd, true);
                l(gzo.bq, false);
                j(gzo.bt, false);
                l(gze.g, true);
                l(gze.n, false);
                l(gzb.b, true);
                l(gym.K, true);
                l(gym.T, true);
                l(gym.ad, false);
                l(gzs.ao, false);
                l(gzs.U, false);
                l(gzs.V, true);
                l(gzs.aa, false);
                l(hab.d, hbcVar.b(hbc.ENG));
                c(gzs.a, Integer.valueOf(gzr.OFF.ordinal()));
                l(gzs.aq, true);
                c(gzs.b, 0);
                l(gzs.L, false);
                l(hak.E, false);
                l(gzs.aB, false);
                g(hac.m, Float.valueOf(2.747752E7f));
                g(hac.n, Float.valueOf(4.9411428E7f));
                j(gzz.h, false);
                l(gzz.l, false);
                l(haa.aa, true);
                l(haa.W, true);
                l(haa.B, true);
                l(haa.C, true);
                l(haa.D, true);
                c(hae.b, Integer.valueOf(((Integer) a(hae.c).get()).intValue() * 4));
                l(hak.m, true);
                l(hak.n, true);
                l(hak.v, true);
                l(hak.q, true);
                l(hak.I, false);
                l(hak.J, false);
                l(gzc.B, false);
                l(hak.s, false);
                l(gzs.aP, false);
                l(gys.d, true);
                l(haz.a, false);
                qji.a = 3;
            } else if (pnqVar.b) {
                l(gzo.ay, false);
                l(gzo.aY, false);
                l(gzp.k, true);
            } else if (!pnqVar.D) {
                if (pnqVar.e()) {
                    l(hay.b, true);
                    c(hay.a, -13);
                } else if (pnqVar.n()) {
                    l(hay.b, true);
                    gzg gzgVar4 = hay.k;
                    float f = 0.001f;
                    if (!pnqVar.E && !pnqVar.F) {
                        f = 0.008f;
                    }
                    g(gzgVar4, Float.valueOf(f));
                }
            }
        }
        if (pnqVar.m()) {
            return;
        }
        d(gzo.n, Integer.valueOf(!p(gzo.ay) ? -1 : (pnqVar.i() || pnqVar.l || pnqVar.c() || pnqVar.t || pnqVar.l() || pnqVar.u || pnqVar.o() || pnqVar.x || pnqVar.f() || pnqVar.B || pnqVar.C) ? i2 : i));
    }

    private static final void q(Map map, gzg gzgVar, Object obj) {
        map.put(gzgVar, obj);
    }

    public final Optional a(gzi gziVar) throws NumberFormatException {
        String strA;
        gox goxVar = (gox) this.b.get(gziVar);
        goxVar.getClass();
        Optional optionalEmpty = Optional.empty();
        if (gziVar.a()) {
            optionalEmpty = Optional.of((Integer) goxVar.k());
        }
        if (gziVar.b()) {
            Supplier supplier = gziVar.d;
            supplier.getClass();
            Object obj = supplier.get();
            obj.getClass();
            optionalEmpty = Optional.of(Integer.valueOf(((Long) obj).intValue()));
        }
        if (optionalEmpty.isPresent() && !gziVar.c) {
            return optionalEmpty;
        }
        hbh hbhVar = this.c;
        String str = gziVar.a;
        String strE = hbhVar.e(str);
        Object objDecode = null;
        if (strE != null) {
            try {
                objDecode = Integer.decode(strE);
                hbhVar.f(gziVar);
            } catch (NumberFormatException e) {
                ((sgt) ((sgt) hbh.a.c().i(e)).M(1095)).E("getAdbOrGserviceIntValue: adbName=%s value=%s", str, strE);
            }
        }
        if (objDecode == null && optionalEmpty.isPresent()) {
            objDecode = optionalEmpty.get();
        }
        if (objDecode == null && (strA = hbhVar.b.a(str)) != null) {
            try {
                objDecode = Integer.decode(strA);
            } catch (NumberFormatException e2) {
                ((sgt) ((sgt) hbh.a.c().i(e2)).M(1094)).E("getAdbOrGserviceIntValue: gservicesName=%s value=%s", str, strA);
            }
        }
        if (objDecode == null) {
            objDecode = (Integer) goxVar.b;
        }
        if (objDecode == null || ((Integer) objDecode).intValue() == Integer.MIN_VALUE) {
            return Optional.empty();
        }
        scn scnVar = gziVar.e;
        boolean z = true;
        if (!scnVar.isEmpty() && !scnVar.contains(objDecode)) {
            z = false;
        }
        rnt.P(z, "%s must be one of: %s", gziVar.a, scnVar);
        return Optional.of(objDecode);
    }

    public final Set b() {
        return this.c.d;
    }

    public final void c(gzi gziVar, Integer num) {
        this.b.put(gziVar, new gox(num, hbh.b(gziVar, num)));
    }

    public final void d(gzi gziVar, Integer num) {
        this.b.put(gziVar, new gox(num, hbh.b(gziVar, num)));
    }

    public final Optional e(gzg gzgVar) {
        gox goxVar = (gox) this.b.get(gzgVar);
        goxVar.getClass();
        Optional optionalEmpty = Optional.empty();
        if (gzgVar.a()) {
            optionalEmpty = Optional.of(Float.valueOf(((Double) goxVar.k()).floatValue()));
        }
        if (gzgVar.b()) {
            Supplier supplier = gzgVar.d;
            supplier.getClass();
            Object obj = supplier.get();
            obj.getClass();
            optionalEmpty = Optional.of(Float.valueOf(((Double) obj).floatValue()));
        }
        if (optionalEmpty.isPresent() && !gzgVar.c) {
            return optionalEmpty;
        }
        hbh hbhVar = this.c;
        String str = gzgVar.a;
        String strE = hbhVar.e(str);
        Object objValueOf = null;
        if (strE != null) {
            try {
                objValueOf = Float.valueOf(Float.parseFloat(strE));
                hbhVar.f(gzgVar);
            } catch (NumberFormatException e) {
                ((sgt) ((sgt) hbh.a.c().i(e)).M(1096)).E("getAdbOrPreferenceFloatValue: adbName=%s value=%s", str, strE);
            }
        }
        if (objValueOf == null) {
            SharedPreferences sharedPreferences = hbhVar.c;
            if (sharedPreferences.contains(str)) {
                hbhVar.f(gzgVar);
                objValueOf = Float.valueOf(sharedPreferences.getFloat(str, Float.MIN_VALUE));
            }
        }
        if (objValueOf == null && optionalEmpty.isPresent()) {
            objValueOf = optionalEmpty.get();
        }
        if (objValueOf == null || ((Float) objValueOf).floatValue() == Float.MIN_VALUE) {
            objValueOf = (Float) goxVar.b;
        }
        return Optional.ofNullable(objValueOf);
    }

    public final String f(gzg gzgVar) {
        Object obj;
        Object string;
        gox goxVar = (gox) this.b.get(gzgVar);
        goxVar.getClass();
        Optional optionalEmpty = Optional.empty();
        if (gzgVar.a()) {
            optionalEmpty = Optional.of((String) goxVar.k());
        }
        if (gzgVar.b()) {
            Supplier supplier = gzgVar.d;
            supplier.getClass();
            Object obj2 = supplier.get();
            obj2.getClass();
            optionalEmpty = Optional.of((String) obj2);
        }
        if (!optionalEmpty.isPresent() || gzgVar.c) {
            hbh hbhVar = this.c;
            String str = gzgVar.a;
            Object objE = hbhVar.e(str);
            if (objE != null) {
                hbhVar.f(gzgVar);
                obj = objE;
            } else {
                SharedPreferences sharedPreferences = hbhVar.c;
                if (!sharedPreferences.contains(str) || (string = sharedPreferences.getString(str, null)) == null) {
                    obj = (String) optionalEmpty.orElse((String) goxVar.b);
                } else {
                    hbhVar.f(gzgVar);
                    obj = string;
                }
            }
        } else {
            obj = optionalEmpty.get();
        }
        return (String) obj;
    }

    public final void g(gzg gzgVar, Float f) {
        this.b.put(gzgVar, new gox(f, hbh.a(gzgVar, f)));
    }

    public final void h(gzg gzgVar, String str) {
        this.b.put(gzgVar, new gox(str, hbh.c(gzgVar, str)));
    }

    public final void i(gzg gzgVar) {
        q(this.b, gzgVar, new gox(true, hbh.d(gzgVar, true)));
    }

    public final void j(gzg gzgVar, boolean z) {
        q(this.b, gzgVar, new gox(z, hbh.d(gzgVar, z)));
    }

    public final void k(gzg gzgVar, Float f) {
        this.b.put(gzgVar, new gox(f, hbh.a(gzgVar, f)));
    }

    public final void l(gzg gzgVar, boolean z) {
        q(this.b, gzgVar, new gox(z, hbh.d(gzgVar, z)));
    }

    public final void m(gzg gzgVar, String str) {
        this.b.put(gzgVar, new gox(str, hbh.c(gzgVar, str)));
    }

    public final void n(gzg gzgVar, String str) {
        this.b.put(gzgVar, new gox(str, (qxt) null));
    }

    public final boolean o(gzg gzgVar) {
        gox goxVar = (gox) this.b.get(gzgVar);
        goxVar.getClass();
        return hbh.g((Boolean) goxVar.b);
    }

    public final boolean p(gzg gzgVar) {
        gox goxVar = (gox) this.b.get(gzgVar);
        goxVar.getClass();
        Optional optionalEmpty = Optional.empty();
        if (gzgVar.a()) {
            optionalEmpty = Optional.of((Boolean) goxVar.k());
        }
        if (gzgVar.b()) {
            Supplier supplier = gzgVar.d;
            supplier.getClass();
            Object obj = supplier.get();
            obj.getClass();
            optionalEmpty = Optional.of((Boolean) obj);
        }
        if (optionalEmpty.isPresent() && !gzgVar.c) {
            return ((Boolean) optionalEmpty.get()).booleanValue();
        }
        hbh hbhVar = this.c;
        String str = gzgVar.a;
        String strE = hbhVar.e(str);
        if (strE != null) {
            hbhVar.f(gzgVar);
            return har.a(strE);
        }
        if (optionalEmpty.isPresent()) {
            return ((Boolean) optionalEmpty.get()).booleanValue();
        }
        String strA = hbhVar.b.a(str);
        return strA != null ? har.a(strA) : hbh.g((Boolean) goxVar.b);
    }
}
