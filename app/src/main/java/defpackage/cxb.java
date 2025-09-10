package defpackage;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.hardware.SensorManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.time.Duration;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxb {
    public final Object a;

    public cxb(Object obj) {
        this.a = obj;
    }

    public static Object A(Context context, String str) {
        Object systemService = context.getSystemService(str);
        systemService.getClass();
        return systemService;
    }

    public static final hlf H() {
        return new hli(1);
    }

    public static final void I() {
        gzi gziVar = gzo.a;
    }

    public static final void K(pnq pnqVar, hbj hbjVar, hbj hbjVar2, hbc hbcVar, pnp pnpVar) {
        gzo.a(hbjVar2, pnpVar, hbcVar);
        hbjVar2.l(hay.b, false);
        hbjVar2.l(hay.c, true);
        hbjVar2.l(hay.d, true);
        hbjVar2.l(hay.e, true);
        hbjVar2.l(hay.f, true);
        hbjVar2.l(hay.g, true);
        hbjVar2.l(hay.h, true);
        hbjVar2.l(hay.i, true);
        hbjVar2.l(hay.j, true);
        hbjVar2.d(hay.a, null);
        hbjVar2.k(hay.k, Float.valueOf(0.008f));
        hbjVar2.l(gza.a, false);
        hbjVar2.l(gza.b, false);
        hbjVar2.l(gza.c, false);
        hbjVar2.l(gza.d, false);
        hbjVar2.l(gza.e, false);
        hbjVar2.l(gza.f, false);
        hbjVar2.l(gza.g, false);
        hbjVar2.l(gza.h, false);
        hbjVar2.i(gza.i);
        hbjVar2.i(gza.j);
        gzg gzgVar = gza.k;
        Float fValueOf = Float.valueOf(0.0f);
        hbjVar2.k(gzgVar, fValueOf);
        hbjVar2.k(gza.l, fValueOf);
        hbjVar2.k(gza.m, fValueOf);
        hbjVar2.k(gza.n, fValueOf);
        hbjVar2.k(gza.o, fValueOf);
        hbjVar2.k(gza.p, fValueOf);
        hbjVar2.l(gza.q, false);
        hbjVar2.l(gza.r, false);
        hbjVar2.l(gza.s, false);
        hbjVar2.l(gza.t, false);
        gzg gzgVar2 = gza.u;
        Float fValueOf2 = Float.valueOf(0.5f);
        hbjVar2.k(gzgVar2, fValueOf2);
        if (pnqVar.m()) {
            return;
        }
        gyg.a(hbjVar2);
        hbjVar2.j(hal.a, false);
        hbjVar2.j(hal.b, true);
        hbjVar2.j(hal.c, true);
        hbjVar2.j(hal.d, true);
        hbjVar2.j(hal.e, true);
        hbjVar2.k(hal.f, Float.valueOf(16000.0f));
        gzg gzgVar3 = hal.g;
        Float fValueOf3 = Float.valueOf(0.1f);
        hbjVar2.k(gzgVar3, fValueOf3);
        hbjVar2.k(hal.h, Float.valueOf(3200.0f));
        gzg gzgVar4 = hal.i;
        Float fValueOf4 = Float.valueOf(50.0f);
        hbjVar2.k(gzgVar4, fValueOf4);
        hbjVar2.k(hal.j, Float.valueOf(6000.0f));
        hbjVar2.m(hal.k, "#FF00FF");
        hbjVar2.k(hal.l, fValueOf2);
        gzg gzgVar5 = hal.m;
        Float fValueOf5 = Float.valueOf(1.0f);
        hbjVar2.k(gzgVar5, fValueOf5);
        hbjVar2.k(hal.n, fValueOf5);
        gzg gzgVar6 = hal.o;
        Float fValueOf6 = Float.valueOf(5.0f);
        hbjVar2.k(gzgVar6, fValueOf6);
        hbjVar2.k(hal.p, fValueOf6);
        gzg gzgVar7 = hal.q;
        Float fValueOf7 = Float.valueOf(30.0f);
        hbjVar2.k(gzgVar7, fValueOf7);
        hbjVar2.l(gyj.a, false);
        hbjVar2.l(gyj.b, false);
        gym.a(hbjVar2);
        gyo.a(hbjVar2);
        gyp.a(hbjVar2);
        gys.b(hbjVar2, pnqVar);
        int i = gyu.a;
        gyv.a(hbjVar2);
        gyw.a(hbjVar2);
        hbjVar2.l(gyy.a, true);
        hbjVar2.l(gyy.b, true);
        hbjVar2.l(gzb.b, false);
        hbjVar2.l(gzb.d, false);
        hbjVar2.l(gzb.c, false);
        hbjVar2.l(gzb.e, true);
        hbjVar2.d(gzb.a, 180);
        hbjVar2.k(gze.a, Float.valueOf(25.0f));
        hbjVar2.k(gze.b, Float.valueOf(0.86f));
        hbjVar2.l(gze.c, true);
        hbjVar2.l(gze.d, true);
        hbjVar2.l(gze.e, true);
        hbjVar2.l(gze.f, false);
        hbjVar2.l(gze.g, false);
        hbjVar2.l(gze.h, false);
        hbjVar2.l(gze.i, false);
        hbjVar2.k(gze.j, Float.valueOf(300.0f));
        hbjVar2.l(gze.k, false);
        hbjVar2.l(gze.l, false);
        hbjVar2.l(gze.m, false);
        hbjVar2.l(gze.n, true);
        hbjVar2.l(gze.o, false);
        gzs.a(hbjVar2);
        gzg gzgVar8 = gzt.a;
        hbcVar.b(hbc.FISHFOOD);
        hbjVar2.l(gzt.a, true);
        hbjVar2.l(gzt.b, true);
        hbjVar2.l(gzt.c, true);
        hbjVar2.i(gzu.a);
        hbjVar2.l(gzu.b, true);
        hbjVar2.k(gzu.c, fValueOf3);
        hbjVar2.k(gzu.d, fValueOf4);
        int i2 = gzv.a;
        hbjVar2.d(gzw.a, 2);
        hbjVar2.l(gzw.d, true);
        hbjVar2.l(gzw.c, true);
        hbjVar2.l(gzw.e, false);
        hbjVar2.l(gzw.h, false);
        hbjVar2.l(gzw.f, true);
        gzg gzgVar9 = gzw.g;
        Float fValueOf8 = Float.valueOf(1.5f);
        hbjVar2.k(gzgVar9, fValueOf8);
        hbjVar2.l(gzw.j, true);
        hbjVar2.l(gzw.i, true);
        hbjVar2.m(gzw.k, "2.23.111");
        hbjVar2.l(gzw.l, true);
        hbjVar2.l(gzw.m, true);
        hbjVar2.d(gzw.b, 250);
        hbjVar2.l(gzw.n, false);
        hbjVar2.l(gzw.o, true);
        hbjVar2.l(hac.l, true);
        hbjVar2.k(hac.m, Float.valueOf(2.948064E7f));
        hbjVar2.k(hac.n, Float.valueOf(2.380845E7f));
        hbjVar2.l(hac.o, true);
        hbjVar2.l(hac.p, true);
        hbjVar2.l(hac.q, false);
        hbjVar2.d(hac.a, 1500);
        hbjVar2.d(hac.b, 6000);
        hbjVar2.l(hac.r, false);
        hbjVar2.d(hac.d, 9);
        hbjVar2.d(hac.e, 2000);
        hbjVar2.d(hac.f, 15);
        hbjVar2.d(hac.c, 15);
        hbjVar2.i(hac.s);
        hbjVar2.l(hac.t, true);
        hbjVar2.l(hac.u, true);
        hbjVar2.k(hac.v, null);
        hbjVar2.l(hac.x, true);
        hbjVar2.l(hac.y, true);
        hbjVar2.d(hac.g, 1500);
        hbjVar2.l(hac.w, true);
        hbjVar2.l(hac.z, true);
        hbjVar2.l(hac.A, true);
        hbjVar2.l(hac.G, true);
        hbjVar2.l(hac.H, true);
        gzg gzgVar10 = hac.B;
        Float fValueOf9 = Float.valueOf(-2.4f);
        hbjVar2.k(gzgVar10, fValueOf9);
        gzg gzgVar11 = hac.C;
        Float fValueOf10 = Float.valueOf(-2.3f);
        hbjVar2.k(gzgVar11, fValueOf10);
        gzg gzgVar12 = hac.D;
        Float fValueOf11 = Float.valueOf(-2.0f);
        hbjVar2.k(gzgVar12, fValueOf11);
        gzg gzgVar13 = hac.E;
        Float fValueOf12 = Float.valueOf(-1.75f);
        hbjVar2.k(gzgVar13, fValueOf12);
        gzg gzgVar14 = hac.F;
        Float fValueOf13 = Float.valueOf(-3.0f);
        hbjVar2.k(gzgVar14, fValueOf13);
        hbjVar2.k(hac.I, fValueOf9);
        hbjVar2.k(hac.J, fValueOf10);
        hbjVar2.l(hac.K, true);
        hbjVar2.l(hac.L, false);
        hbjVar2.l(hac.N, false);
        hbjVar2.l(hac.O, false);
        gzg gzgVar15 = hac.P;
        Float fValueOf14 = Float.valueOf(-5.5f);
        hbjVar2.k(gzgVar15, fValueOf14);
        hbjVar2.k(hac.Q, fValueOf14);
        hbjVar2.k(hac.R, fValueOf14);
        hbjVar2.k(hac.S, fValueOf14);
        hbjVar2.l(hac.M, true);
        hbjVar2.l(hac.T, true);
        hbjVar2.d(hac.j, 150000);
        hbjVar2.d(hac.h, 15);
        hbjVar2.d(hac.i, 6);
        hbjVar2.l(hac.U, true);
        hbjVar2.d(hac.k, null);
        hbjVar2.l(gzy.j, false);
        hbjVar2.l(gzy.k, false);
        hbjVar2.l(gzy.l, false);
        hbjVar2.d(gzy.c, -1);
        hbjVar2.d(gzy.d, 15);
        hbjVar2.d(gzy.e, 30);
        hbjVar2.d(gzy.f, 60);
        gzg gzgVar16 = gzy.m;
        Float f = gzy.b;
        hbjVar2.k(gzgVar16, f);
        hbjVar2.k(gzy.n, f);
        hbjVar2.d(gzy.g, 10000);
        hbjVar2.l(gzy.o, true);
        hbjVar2.l(gzy.p, false);
        hbjVar2.l(gzy.q, true);
        hbjVar2.l(gzy.r, true);
        hbjVar2.l(gzy.s, true);
        hbjVar2.d(gzy.h, 1);
        hbjVar2.d(gzy.i, 30);
        hbjVar2.l(gzy.t, true);
        gzi gziVar = gzz.a;
        hbcVar.b(hbc.ENG);
        hbjVar2.l(gzz.d, true);
        hbjVar2.l(gzz.e, true);
        hbjVar2.l(gzz.f, true);
        hbjVar2.l(gzz.g, true);
        hbjVar2.j(gzz.h, true);
        hbjVar2.i(gzz.i);
        hbjVar2.l(gzz.k, true);
        hbjVar2.l(gzz.j, true);
        hbjVar2.l(gzz.l, false);
        hbjVar2.l(gzz.m, true);
        hbjVar2.l(gzz.n, true);
        hbjVar2.l(gzz.o, true);
        hbjVar2.l(gzz.q, true);
        hbjVar2.l(gzz.p, true);
        hbjVar2.l(gzz.t, true);
        hbjVar2.l(gzz.u, true);
        hbjVar2.l(gzz.v, true);
        hbjVar2.l(gzz.w, false);
        hbjVar2.l(gzz.x, false);
        hbjVar2.l(gzz.r, true);
        hbjVar2.l(gzz.s, true);
        hbjVar2.l(gzz.y, true);
        hbjVar2.l(gzz.z, true);
        hbjVar2.l(gzz.A, true);
        hbjVar2.d(gzz.b, 1100);
        hbjVar2.d(gzz.a, 2);
        hbjVar2.l(gzz.B, true);
        hbjVar2.d(gzz.c, 3);
        hbjVar2.l(gzz.C, false);
        hbjVar2.l(gzz.D, false);
        hbjVar2.l(gzz.E, false);
        hbjVar2.l(haa.g, true);
        hbjVar2.l(haa.h, true);
        hbjVar2.l(haa.i, true);
        hbjVar2.l(haa.f, true);
        hbjVar2.l(haa.v, true);
        hbjVar2.l(haa.s, true);
        hbjVar2.l(haa.j, true);
        hbjVar2.l(haa.k, true);
        hbjVar2.l(haa.l, true);
        hbjVar2.l(haa.m, true);
        hbjVar2.l(haa.n, true);
        hbjVar2.l(haa.o, false);
        hbjVar2.l(haa.w, false);
        hbjVar2.l(haa.p, false);
        hbjVar2.l(haa.q, false);
        hbjVar2.l(haa.r, true);
        hbjVar2.i(haa.x);
        hbjVar2.l(haa.y, false);
        hbjVar2.l(haa.z, false);
        hbjVar2.l(haa.A, true);
        hbjVar2.l(haa.D, false);
        hbjVar2.l(haa.E, false);
        hbjVar2.l(haa.F, true);
        hbjVar2.l(haa.G, true);
        hbjVar2.l(haa.H, true);
        hbjVar2.l(haa.I, false);
        hbjVar2.l(haa.t, false);
        hbjVar2.l(haa.u, false);
        hbjVar2.l(haa.J, true);
        hbjVar2.l(haa.K, true);
        hbjVar2.l(haa.S, true);
        hbjVar2.l(haa.T, true);
        hbjVar2.l(haa.U, true);
        hbjVar2.l(haa.V, true);
        hbjVar2.l(haa.W, false);
        hbjVar2.l(haa.X, false);
        hbjVar2.l(haa.aa, false);
        hbjVar2.l(haa.ab, false);
        hbjVar2.l(haa.ac, true);
        hbjVar2.l(haa.B, false);
        hbjVar2.l(haa.C, false);
        hbjVar2.i(haa.ad);
        hbjVar2.l(haa.ae, true);
        hbjVar2.l(haa.af, true);
        hbjVar2.l(haa.L, true);
        hbjVar2.l(haa.M, true);
        hbjVar2.l(haa.ag, true);
        hbjVar2.l(haa.Q, true);
        hbjVar2.l(haa.P, true);
        hbjVar2.l(haa.N, true);
        hbjVar2.l(haa.R, true);
        hbjVar2.l(haa.O, true);
        hbjVar2.l(haa.ah, true);
        hbjVar2.l(haa.ai, true);
        hbjVar2.l(haa.Y, false);
        hbjVar2.l(haa.Z, false);
        hbjVar2.d(haa.d, 5);
        hbjVar2.d(haa.e, 19000000);
        hbjVar2.l(haa.aj, false);
        hbjVar2.d(haa.b, 0);
        hbjVar2.d(haa.c, 15);
        hbjVar2.l(haa.ak, false);
        hbjVar2.d(haa.a, 0);
        hbjVar2.d(gzn.a, Integer.valueOf(gzm.a.ordinal()));
        hbjVar2.d(gzn.b, Integer.valueOf(gzl.a.ordinal()));
        hbjVar2.d(gzn.c, 3000);
        hbjVar2.d(gzn.d, Integer.valueOf(gzk.b.ordinal()));
        hbjVar2.l(gzq.d, false);
        hbjVar2.d(gzq.a, 5);
        hbjVar2.d(gzq.b, 1);
        hbjVar2.d(gzq.c, 3);
        hbjVar2.l(gzq.e, false);
        hbjVar2.k(gzq.f, fValueOf);
        hbjVar2.l(had.b, true);
        hbjVar2.m(had.c, "AUHGNIST");
        hbjVar2.d(had.a, 4096);
        hbjVar2.l(hae.i, true);
        hbjVar2.d(hae.a, 125);
        hbjVar2.l(hae.j, false);
        gzi gziVar2 = hae.c;
        hbjVar2.d(gziVar2, 7);
        hbjVar2.d(hae.d, 20);
        hbjVar2.d(hae.b, Integer.valueOf(((Integer) hbjVar.a(gziVar2).get()).intValue() * 4));
        hbjVar2.l(hae.k, true);
        hbjVar2.l(hae.l, false);
        hbjVar2.l(hae.p, false);
        hbjVar2.l(hae.q, true);
        hbjVar2.l(hae.r, true);
        hbjVar2.d(hae.e, 0);
        hbjVar2.i(hae.m);
        hbjVar2.d(hae.f, 6);
        hbjVar2.l(hae.n, true);
        hbjVar2.l(hae.o, false);
        hbjVar2.d(hae.g, 2);
        hbjVar2.d(hae.h, 4);
        hbjVar2.l(hae.s, true);
        hbjVar2.l(hae.t, false);
        hbjVar2.l(hae.u, true);
        hbjVar2.l(hae.v, true);
        hbjVar2.l(hae.x, false);
        hbjVar2.l(hae.w, false);
        hbjVar2.l(hae.y, false);
        hbjVar2.j(hae.z, true);
        hbjVar2.j(haf.c, false);
        hbjVar2.l(haf.a, false);
        hbjVar2.l(haf.b, true);
        int i3 = hag.a;
        hbjVar2.d(hai.a, -1);
        hbjVar2.l(hai.b, true);
        hbjVar2.l(hai.c, false);
        hbjVar2.l(hak.b, true);
        hbjVar2.k(hak.c, fValueOf8);
        hbjVar2.k(hak.d, fValueOf8);
        gzg gzgVar17 = hak.e;
        Float fValueOf15 = Float.valueOf(2.0f);
        hbjVar2.k(gzgVar17, fValueOf15);
        hbjVar2.k(hak.f, fValueOf5);
        hbjVar2.d(hak.a, 4);
        hbjVar2.l(hak.g, true);
        hbjVar2.l(hak.h, true);
        hbjVar2.l(hak.i, false);
        hbjVar2.l(hak.j, false);
        hbjVar2.l(hak.k, false);
        hbjVar2.l(hak.m, false);
        hbjVar2.l(hak.n, false);
        hbjVar2.l(hak.l, false);
        hbjVar2.l(hak.o, true);
        hbjVar2.l(hak.p, false);
        hbjVar2.l(hak.q, false);
        hbjVar2.l(hak.r, false);
        hbjVar2.l(hak.s, true);
        hbjVar2.l(hak.t, false);
        hbjVar2.m(hak.u, "");
        hbjVar2.l(hak.v, false);
        hbjVar2.l(hak.w, false);
        hbjVar2.l(hak.x, false);
        hbjVar2.l(hak.y, false);
        hbjVar2.l(hak.z, false);
        hbjVar2.l(hak.A, false);
        hbjVar2.l(hak.B, true);
        hbjVar2.l(hak.C, true);
        hbjVar2.l(hak.D, true);
        hbjVar2.l(hak.E, true);
        hbjVar2.l(hak.F, true);
        hbjVar2.l(hak.G, false);
        hbjVar2.l(hak.H, true);
        hbjVar2.l(hak.I, true);
        hbjVar2.l(hak.J, true);
        hbjVar2.l(hak.K, false);
        hbjVar2.l(hak.L, false);
        hbjVar2.m(hak.M, "");
        hbjVar2.m(hak.N, "");
        hbjVar2.m(hak.O, "");
        hbjVar2.m(hak.P, "");
        hbjVar2.m(hak.Q, "");
        hbjVar2.m(hak.R, "");
        hbjVar2.m(hak.S, "");
        hbjVar2.m(hak.T, "");
        hbjVar2.m(hak.U, "");
        hbjVar2.n(hak.W, "");
        hbjVar2.n(hak.V, "");
        gzg gzgVar18 = hak.X;
        Float fValueOf16 = Float.valueOf(7.0f);
        hbjVar2.k(gzgVar18, fValueOf16);
        hbjVar2.l(hak.Z, false);
        hbjVar2.l(hak.Y, false);
        hbjVar2.l(hak.aa, false);
        hbjVar2.l(hak.ad, false);
        hbjVar2.l(hak.ae, false);
        hbjVar2.l(hak.af, false);
        hbjVar2.j(hak.ai, false);
        hbjVar2.l(hak.aj, false);
        hbjVar2.m(hak.ag, "");
        hbjVar2.m(hak.ah, "");
        hbjVar2.l(hak.ab, false);
        hbjVar2.m(hak.ac, "");
        hbjVar2.j(hak.ak, false);
        hbjVar2.j(hak.al, false);
        hbjVar2.d(ham.a, 1);
        hbjVar2.l(ham.b, true);
        hbjVar2.l(ham.c, true);
        hbjVar2.l(ham.d, true);
        hbjVar2.l(ham.e, false);
        hbjVar2.l(ham.f, false);
        hbjVar2.l(ham.g, false);
        hbjVar2.l(ham.h, false);
        hbjVar2.l(ham.i, true);
        gyz.a(hbjVar2);
        hbjVar2.i(hap.a);
        hbjVar2.k(hao.a, Float.valueOf(500.0f));
        hbjVar2.k(hao.b, Float.valueOf(250.0f));
        gzg gzgVar19 = hao.c;
        Float fValueOf17 = Float.valueOf(80.0f);
        hbjVar2.k(gzgVar19, fValueOf17);
        hbjVar2.k(hao.d, fValueOf17);
        hbjVar2.k(hao.e, Float.valueOf(-0.3f));
        hbjVar2.k(hao.f, Float.valueOf(-1.0f));
        hbjVar2.k(hao.g, fValueOf13);
        hbjVar2.k(hao.h, Float.valueOf(-3.5f));
        gzg gzgVar20 = hao.i;
        Float fValueOf18 = Float.valueOf(115.0f);
        hbjVar2.k(gzgVar20, fValueOf18);
        hbjVar2.k(hao.j, fValueOf18);
        hbjVar2.l(haq.a, true);
        hbjVar2.k(haq.b, Float.valueOf(0.3f));
        hbjVar2.l(haq.c, true);
        hbjVar2.l(haq.d, true);
        hbjVar2.l(haq.e, true);
        hbjVar2.m(haq.f, "");
        hbjVar2.d(hav.b, 3);
        hbjVar2.d(hav.a, 3);
        hbjVar2.d(hav.d, 2);
        hbjVar2.d(hav.f, 2);
        hbjVar2.d(hav.g, 2);
        hbjVar2.d(hav.h, 3);
        hbjVar2.d(hav.e, 3);
        hbjVar2.d(hav.i, 3);
        hbjVar2.d(hav.j, 3);
        hbjVar2.d(hav.k, 2);
        hbjVar2.d(hav.c, 2);
        hbjVar2.d(hav.l, 2);
        hbjVar2.d(hav.m, 3);
        hbjVar2.d(hav.n, 3);
        hbjVar2.d(hav.o, 3);
        hbjVar2.d(hav.p, 4);
        hbjVar2.d(hav.q, 4);
        hbjVar2.d(hav.r, 5);
        hbjVar2.d(hav.s, 3);
        hbjVar2.d(hav.t, 3);
        hbjVar2.d(hav.u, 3);
        hbjVar2.d(hav.v, 4);
        hbjVar2.d(hav.w, 3);
        hbjVar2.d(hav.x, 6);
        hbjVar2.d(hav.y, 6);
        hbjVar2.l(haw.f, true);
        hbjVar2.l(haw.g, false);
        hbjVar2.l(haw.h, true);
        hbjVar2.l(haw.i, true);
        hbjVar2.l(haw.j, true);
        hbjVar2.k(haw.k, fValueOf8);
        hbjVar2.l(haw.l, false);
        hbjVar2.d(haw.a, null);
        hbjVar2.k(haw.m, Float.valueOf(0.138f));
        hbjVar2.d(haw.d, 750);
        hbjVar2.l(haw.n, false);
        hbjVar2.l(haw.o, false);
        hbjVar2.l(haw.p, true);
        hbjVar2.d(haw.b, 5);
        hbjVar2.l(haw.q, false);
        hbjVar2.k(haw.s, fValueOf11);
        hbjVar2.k(haw.t, fValueOf12);
        hbjVar2.k(haw.r, Float.valueOf(-4.0f));
        hbjVar2.d(haw.c, 1000);
        hbjVar2.k(haw.u, fValueOf);
        hbjVar2.l(haw.v, false);
        hbjVar2.l(haw.w, false);
        hbjVar2.l(haw.x, true);
        hbjVar2.k(haw.y, Float.valueOf(0.2f));
        hbjVar2.d(haw.e, 0);
        int i4 = hat.a;
        hbjVar2.j(has.c, true);
        hbjVar2.d(has.a, 5);
        hbjVar2.d(has.b, 5);
        hbjVar2.l(has.d, true);
        hbjVar2.l(has.e, false);
        hbjVar2.l(has.f, true);
        hbjVar2.m(has.g, "");
        hbjVar2.m(has.h, "");
        hbjVar2.l(has.i, true);
        gyx.a(hbjVar2);
        hbjVar2.l(haz.a, true);
        hbjVar2.l(haz.b, true);
        hbjVar2.l(hab.d, false);
        hbjVar2.l(hab.e, false);
        hbjVar2.l(hab.f, false);
        hbjVar2.l(hab.g, false);
        hbjVar2.d(hab.b, 7);
        hbjVar2.d(hab.c, 16);
        hbjVar2.d(hab.a, 3);
        hbjVar2.l(hab.h, false);
        hbjVar2.m(hab.i, "motion-custom_op-v4.tflite.uncompressed");
        hbjVar2.m(hab.j, "saliency-custom_op-v4.tflite.uncompressed");
        hbjVar2.d(hau.a, -1);
        hbjVar2.d(hau.b, 3);
        hbjVar2.d(hau.c, 0);
        hbjVar2.d(hau.d, Integer.MAX_VALUE);
        gzc.a(hbjVar2, hbcVar);
        hbjVar2.l(gzj.f, true);
        hbjVar2.d(gzj.b, 0);
        hbjVar2.d(gzj.c, 16);
        hbjVar2.d(gzj.d, 30000);
        hbjVar2.d(gzj.e, 1500);
        hbjVar2.d(gzj.a, 120);
        hbjVar2.k(gzj.g, Float.valueOf(0.6f));
        hbjVar2.l(haj.a, false);
        hbjVar2.m(haj.b, "99999.99");
        gyf.a(hbjVar2);
        gyh.a(hbjVar2);
        hbjVar2.l(han.c, false);
        hbjVar2.l(han.d, false);
        hbjVar2.l(han.e, false);
        hbjVar2.k(han.f, Float.valueOf(66.666664f));
        hbjVar2.d(han.a, 10);
        hbjVar2.l(han.g, false);
        hbjVar2.l(han.h, false);
        hbjVar2.l(han.i, true);
        hbjVar2.l(han.j, false);
        hbjVar2.j(han.k, true);
        hbjVar2.l(han.l, false);
        hbjVar2.d(han.b, 6);
        hbjVar2.j(han.m, false);
        gyk.a(hbjVar2);
        gyi.a(hbjVar2);
        int i5 = gzx.a;
        hbjVar2.l(gzp.k, false);
        hbjVar2.d(gzp.a, 400);
        hbjVar2.l(gzp.l, true);
        hbjVar2.d(gzp.b, 4);
        hbjVar2.l(gzp.m, true);
        hbjVar2.k(gzp.n, Float.valueOf(1.0f));
        hbjVar2.d(gzp.e, 350);
        hbjVar2.d(gzp.f, 1500);
        hbjVar2.d(gzp.c, 15);
        hbjVar2.d(gzp.d, 28);
        hbjVar2.l(gzp.o, true);
        hbjVar2.d(gzp.g, 3);
        hbjVar2.d(gzp.h, 50);
        hbjVar2.d(gzp.i, 100);
        hbjVar2.d(gzp.j, 5000);
        hbjVar2.l(hba.q, false);
        hbjVar2.l(hba.r, true);
        hbjVar2.l(hba.g, false);
        hbjVar2.l(hba.h, true);
        hbjVar2.d(hba.b, 150);
        hbjVar2.l(hba.p, false);
        hbjVar2.l(hba.s, false);
        hbjVar2.k(hba.t, fValueOf5);
        hbjVar2.l(hba.i, false);
        hbjVar2.l(hba.k, true);
        hbjVar2.d(hba.a, null);
        hbjVar2.k(hba.j, Float.valueOf(4.0f));
        hbjVar2.k(hba.l, Float.valueOf(0.670443f));
        hbjVar2.k(hba.m, fValueOf15);
        hbjVar2.k(hba.n, Float.valueOf(4.3f));
        hbjVar2.k(hba.o, fValueOf16);
        hbjVar2.l(hba.u, true);
        hbjVar2.l(hba.v, true);
        hbjVar2.d(hba.c, null);
        hbjVar2.m(hba.w, null);
        hbjVar2.d(hba.d, null);
        hbjVar2.m(hba.x, null);
        hbjVar2.l(hba.y, true);
        hbjVar2.d(hba.e, null);
        hbjVar2.d(hba.f, null);
        hbjVar2.l(hax.c, false);
        hbjVar2.d(hax.a, null);
        hbjVar2.l(hax.j, false);
        hbjVar2.l(hax.d, false);
        hbjVar2.k(hax.h, fValueOf9);
        hbjVar2.k(hax.i, fValueOf10);
        hbjVar2.d(hax.b, Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(10L)));
        hbjVar2.l(hax.e, false);
        hbjVar2.l(hax.f, false);
        hbjVar2.l(hax.g, false);
        int i6 = gyt.a;
        hbjVar2.k(hbb.d, Float.valueOf(100.0f));
        hbjVar2.k(hbb.c, fValueOf7);
        hbjVar2.k(hbb.b, Float.valueOf(36.0f));
        int i7 = gyl.a;
        hbjVar2.m(hah.a, "");
        hbjVar2.m(hah.b, "");
        hbjVar2.l(gzd.a, false);
    }

    public static final srm o(gpr gprVar) {
        int i;
        tpc tpcVarM = srm.a.m();
        int i2 = gprVar.g;
        int i3 = 11;
        int i4 = 3;
        if (i2 == 1) {
            i = 2;
        } else if (i2 != 2) {
            switch (i2) {
                case 4:
                    i = 4;
                    break;
                case 8:
                    i = 5;
                    break;
                case 16:
                    i = 6;
                    break;
                case 32:
                    i = 7;
                    break;
                case 64:
                    i = 8;
                    break;
                case 128:
                    i = 9;
                    break;
                case 256:
                    i = 10;
                    break;
                case 512:
                    i = 11;
                    break;
                case 1024:
                    i = 12;
                    break;
                case 2048:
                    i = 13;
                    break;
                case 4096:
                    i = 14;
                    break;
                case 32768:
                    i = 16;
                    break;
                default:
                    i = 1;
                    break;
            }
        } else {
            i = 3;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        srm srmVar = (srm) tphVar;
        srmVar.e = i - 1;
        srmVar.b |= 4;
        switch (gprVar.f) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                i3 = 8;
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
            case 10:
                break;
            case 11:
                i3 = 12;
                break;
            case 12:
                i3 = 13;
                break;
            case 13:
                i3 = 14;
                break;
            default:
                i3 = 1;
                break;
        }
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        srm srmVar2 = (srm) tphVar2;
        srmVar2.d = i3 - 1;
        srmVar2.b |= 2;
        int i5 = gprVar.l;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 == 1) {
            i4 = 2;
        } else if (i6 != 2) {
            i4 = 1;
        }
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        srm srmVar3 = (srm) tpcVarM.b;
        srmVar3.c = i4 - 1;
        srmVar3.b |= 1;
        return (srm) tpcVarM.l();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tzj] */
    public final Object B() {
        return ((rwc) this.a.a()).c();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tzj] */
    public final boolean C() {
        return ((rwc) this.a.a()).h();
    }

    public final Bitmap D(InterleavedImageU8 interleavedImageU8) {
        Object obj = this.a;
        tcq tcqVar = tcq.f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) obj, interleavedImageU8.d(), interleavedImageU8.b(), Bitmap.Config.ARGB_8888);
        tcl tclVar = new tcl(bitmapCreateBitmap);
        try {
            InterleavedReadViewU8 interleavedReadViewU8F = interleavedImageU8.f();
            InterleavedWriteViewU8 interleavedWriteViewU8 = tclVar.a;
            long j = interleavedReadViewU8F.a;
            long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
            boolean z = true;
            rnt.B(j != 0, "src is null");
            if (jA == 0) {
                z = false;
            }
            rnt.B(z, "dst is null");
            ImageUtils.simpleRgbToAnyRgbImpl(j, tcqVar.k, jA);
            tclVar.close();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            try {
                tclVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Bitmap E(InterleavedImageU8 interleavedImageU8) {
        Object obj = this.a;
        DisplayMetrics displayMetrics = (DisplayMetrics) obj;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(displayMetrics, interleavedImageU8.d(), interleavedImageU8.b(), Bitmap.Config.ARGB_8888);
        tcl tclVar = new tcl(bitmapCreateBitmap);
        try {
            ImageUtils.a(interleavedImageU8.f(), tclVar.a);
            tclVar.close();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            try {
                tclVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final synchronized void F(long j) {
        Object obj = this.a;
        ((sad) obj).add(Long.valueOf(j));
        ((sad) obj).toArray();
    }

    public final synchronized boolean G(long j) {
        return ((sad) this.a).contains(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J(android.content.Context r30, defpackage.fqb r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxb.J(android.content.Context, fqb):boolean");
    }

    public final jod L(poe poeVar, int i, pjr pjrVar) {
        return new jod(((Gcam) this.a).c(i), poeVar, pjrVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [des, java.lang.Object] */
    public final des a() {
        return ((hkk) this.a).b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final cxm b(String str) {
        str.getClass();
        return (cxm) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Set c() {
        return new HashSet(this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void d() {
        ?? r2 = this.a;
        Iterator it = r2.values().iterator();
        while (it.hasNext()) {
            ((cxm) it.next()).fe();
        }
        r2.clear();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void e(ddx ddxVar) {
        ddxVar.getClass();
        int i = ddxVar.a;
        ?? r3 = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = r3.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            r3.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        Integer numValueOf2 = Integer.valueOf(ddxVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + ddxVar);
        }
        treeMap2.put(numValueOf2, ddxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.url r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dci
            if (r0 == 0) goto L13
            r0 = r6
            dci r0 = (defpackage.dci) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dci r0 = new dci
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.rnt.aN(r6)
            goto L3f
        L2f:
            defpackage.rnt.aN(r6)
            java.lang.Object r4 = r4.a
            r0.b = r3
            utl r4 = (defpackage.utl) r4
            java.lang.Object r4 = r4.gc(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            uer r4 = new uer
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxb.f(url, uhb):java.lang.Object");
    }

    public final Intent g() {
        return ((Activity) this.a).getIntent();
    }

    public final void h(Intent intent) {
        ((Activity) this.a).startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void i(egx egxVar) {
        this.a.add(egxVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final void j(Path path) {
        ?? r5 = this.a;
        int size = r5.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            egx egxVar = (egx) r5.get(size);
            ThreadLocal threadLocal = eln.a;
            if (egxVar != null && !egxVar.a) {
                eln.d(path, ((ehh) egxVar.b).k() / 100.0f, ((ehh) egxVar.c).k() / 100.0f, ((ehh) egxVar.d).k() / 360.0f);
            }
        }
    }

    public final Class k() throws ClassNotFoundException {
        Class<?> clsLoadClass = ((ClassLoader) this.a).loadClass("androidx.window.extensions.WindowExtensions");
        clsLoadClass.getClass();
        return clsLoadClass;
    }

    public final boolean l() {
        return coh.d(new apa(this, 16));
    }

    public final boolean m() {
        return l() && coh.c("WindowExtensionsProvider#getWindowExtensions is not valid", new apa(this, 17));
    }

    public final rwc n(rgb rgbVar) {
        LruCache lruCache = (LruCache) this.a;
        if (!lruCache.snapshot().containsKey(rgbVar.c().a)) {
            lruCache.put(rgbVar.c().a, UUID.randomUUID());
        }
        UUID uuid = (UUID) lruCache.get(rgbVar.c().a);
        return uuid == null ? rvk.a : rwc.j(Long.valueOf(uuid.getMostSignificantBits()));
    }

    public final int p() {
        return ((Integer) ((hbj) this.a).a(gzo.H).get()).intValue();
    }

    public final int q() {
        return ((Integer) ((hbj) this.a).a(gzo.G).get()).intValue();
    }

    public final int r() {
        return ((Integer) ((hbj) this.a).a(gzo.J).get()).intValue();
    }

    public final int s() {
        return ((Integer) ((hbj) this.a).a(gzo.I).get()).intValue();
    }

    public final long t() {
        return Duration.ofMillis(((Integer) ((hbj) this.a).a(gzo.F).get()).intValue()).toNanos();
    }

    public final String u() {
        String strF = ((hbj) this.a).f(gzo.bj);
        strF.getClass();
        return strF;
    }

    public final boolean v() {
        return ((hbj) this.a).p(gzo.bi);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final our w(gdo gdoVar) {
        ?? r1 = this.a;
        if (r1.containsKey(gdoVar)) {
            return (our) r1.get(gdoVar);
        }
        our ourVar = new our();
        r1.put(gdoVar, ourVar);
        return ourVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void x(gdo gdoVar) {
        our ourVar = (our) this.a.remove(gdoVar);
        if (ourVar != null) {
            ourVar.close();
        }
    }

    public final DevicePolicyManager y() {
        return (DevicePolicyManager) A((Context) this.a, "device_policy");
    }

    public final SensorManager z() {
        return (SensorManager) A((Context) this.a, "sensor");
    }

    public cxb(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public cxb() {
        new LinkedHashMap();
        this.a = new hkk((byte[]) null);
    }

    public cxb(int[] iArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public cxb(short[] sArr, byte[] bArr) {
        this.a = new gqp();
    }

    public cxb(char[] cArr, byte[] bArr) {
        this.a = new LruCache(20);
    }

    public cxb(Map map) {
        new LinkedHashMap();
        this.a = new hkk(map);
    }

    public /* synthetic */ cxb(byte[] bArr, byte[] bArr2) {
        ufy ufyVar = ufy.a;
        this.a = ufyVar;
        ske.bQ(new ArrayList(ske.bq(ufyVar, 10)));
    }

    public cxb(hbj hbjVar, pbb pbbVar) {
        this.a = hbjVar;
        pbbVar.a(qcjAcSmlN.JXdMOuIbaxYC);
    }

    public cxb(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public cxb(int i) {
        this.a = utm.a(new int[i]);
    }

    public cxb(hyd hydVar) {
        this.a = new sab(hydVar.a);
    }

    public cxb(hyd hydVar, File file, hbc hbcVar, pnq pnqVar) {
        String absolutePath = file.getAbsolutePath();
        boolean z = pnqVar.a;
        InitParams initParams = new InitParams();
        GcamModuleJNI.InitParams_allow_unknown_devices_set(initParams.a, initParams, hbcVar == hbc.ENG || z);
        tbu tbuVar = tbu.b;
        initParams.c(tbuVar);
        GcamModuleJNI.InitParams_execute_postview_on_set(initParams.a, initParams, tbuVar.e);
        if (hydVar.a()) {
            initParams.c(tbu.d);
        }
        GcamModuleJNI.InitParams_simultaneous_merge_and_finish_set(initParams.a, initParams, initParams.a() != tbuVar);
        hbj hbjVar = hydVar.j;
        gzi gziVar = gzs.a;
        hbj hbjVar2 = hydVar.j;
        GcamModuleJNI.InitParams_eager_simultaneous_merge_and_finish_set(initParams.a, initParams, true);
        GcamModuleJNI.InitParams_serialized_cache_dir_set(initParams.a, initParams, absolutePath);
        GcamModuleJNI.InitParams_wait_for_portrait_brightening_init_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_pecan_wait_until_ready_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_pecan_initialize_on_gcam_creation_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_ml_walnut_initialize_on_gcam_creation_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_lancet_initialize_on_gcam_creation_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_kepler_gan_initialize_on_gcam_creation_set(initParams.a, initParams, false);
        GcamModuleJNI.InitParams_finish_almond_initialize_on_gcam_creation_set(initParams.a, initParams, false);
        this.a = initParams;
    }

    public cxb(char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public cxb(short[] sArr) {
        this.a = new ArrayList();
    }

    public cxb(boolean[] zArr) {
        this.a = new ovx(1);
    }
}
