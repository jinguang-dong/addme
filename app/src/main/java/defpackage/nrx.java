package defpackage;

import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nrx extends nsn {
    public static final List a = ske.bn(pka.FRONT, pka.BACK);
    public static final List b = ske.bn(ltw.OFF, ltw.THREE, ltw.FIVE, ltw.TEN);
    private final Map A;
    public final azr c;
    public final azr d;
    public final List e;
    public final azr f;
    public final azr g;
    public final cwq h;
    public final bgz i;
    public final bgz j;
    public final bgz k;
    public final cwq l;
    public final cwq m;
    public final cwq n;
    public final cwq o;
    public final cwq p;
    public final cwq q;
    public final cwq r;
    public final bgz s;
    public final cwq t;
    public final cwq u;
    public final cwq v;
    private final azr w;
    private final azr x;
    private final Map y;
    private final Map z;

    public nrx() {
        nsu nsuVar = nsu.PHOTO;
        bap bapVar = bap.c;
        azz azzVar = new azz(nsuVar, bapVar);
        this.c = azzVar;
        this.w = new azz(false, bapVar);
        this.d = new azz(false, bapVar);
        this.e = new ArrayList();
        new azz(false, bapVar);
        this.f = new azz(true, bapVar);
        this.x = azzVar;
        pka pkaVar = pka.BACK;
        this.g = new azz(pkaVar, bapVar);
        ltw ltwVar = ltw.OFF;
        this.h = new cwq(ltwVar);
        this.i = new bgz();
        this.j = new bgz();
        this.k = new bgz();
        this.l = new cwq(false);
        this.m = new cwq(false);
        this.n = new cwq(false);
        this.o = new cwq(nsm.NONE);
        cwq cwqVar = new cwq(nsk.e);
        this.p = cwqVar;
        cwq cwqVar2 = new cwq(-1);
        this.q = cwqVar2;
        cwq cwqVar3 = new cwq(false);
        this.r = cwqVar3;
        this.y = ske.bc(new uev(nsu.NIGHT_SIGHT, new nsj(R.string.mode_cuttlefish, R.drawable.ic_cuttlefish)), new uev(nsu.PORTRAIT, new nsj(R.string.mode_portrait, R.drawable.quantum_gm_ic_portrait_vd_theme_24)), new uev(nsuVar, new nsj(R.string.mode_camera_autobahn, R.drawable.quantum_gm_ic_camera_alt_vd_theme_24)), new uev(nsu.VIDEO, new nsj(R.string.mode_video, R.drawable.quantum_gm_ic_videocam_vd_theme_24)), new uev(nsu.TIME_LAPSE, new nsj(R.string.mode_timelapse, R.drawable.quantum_gm_ic_fast_forward_vd_theme_24)), new uev(nsu.SLOW_MOTION, new nsj(R.string.mode_video_slomo, R.drawable.quantum_gm_ic_slow_motion_video_vd_theme_24)), new uev(nsu.AMBER, new nsj(R.string.mode_amber, R.drawable.ic_film_24)), new uev(nsu.ASTRO, new nsj(R.string.astro_value_label, R.drawable.gs_astrophotography_mode_fill1_vd_theme_24)));
        this.z = ske.bc(new uev(pkaVar, new nsj(R.string.menu_camera_facing_back, R.drawable.quantum_gm_ic_landscape_white_24)), new uev(pka.FRONT, new nsj(R.string.menu_camera_facing_front, R.drawable.quantum_gm_ic_person_vd_theme_24)));
        this.A = ske.bc(new uev(ltwVar, new nsj(R.string.menu_timer_off, R.drawable.quantum_gm_ic_timer_off_vd_theme_24)), new uev(ltw.THREE, new nsj(R.plurals.menu_has_timer, R.drawable.quantum_gm_ic_timer_3_alt_1_vd_theme_24)), new uev(ltw.FIVE, new nsj(R.plurals.menu_has_timer, R.drawable.timer_5)), new uev(ltw.TEN, new nsj(R.plurals.menu_has_timer, R.drawable.quantum_gm_ic_timer_10_alt_1_vd_theme_24)));
        this.s = new bgz();
        this.t = cwqVar;
        this.u = cwqVar2;
        this.v = cwqVar3;
    }

    public final int a(pka pkaVar) {
        return ((nsj) ske.bb(this.z, pkaVar)).b;
    }

    public final int b(pka pkaVar) {
        return ((nsj) ske.bb(this.z, pkaVar)).a;
    }

    public final int c(nsu nsuVar) {
        return ((nsj) ske.bb(this.y, nsuVar)).b;
    }

    public final int e(nsu nsuVar) {
        return ((nsj) ske.bb(this.y, nsuVar)).a;
    }

    public final int f(ltw ltwVar) {
        return ((nsj) ske.bb(this.A, ltwVar)).b;
    }

    public final int j(ltw ltwVar) {
        return ((nsj) ske.bb(this.A, ltwVar)).a;
    }

    public final ltw k() {
        Object objA = this.h.a();
        objA.getClass();
        return (ltw) objA;
    }

    public final nsu l() {
        return (nsu) this.x.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(nsu nsuVar) {
        bgz bgzVar = this.s;
        int i = 0;
        ugi ugiVar = new ugi(bgzVar, 0, 1);
        while (true) {
            if (!ugiVar.hasNext()) {
                i = -1;
                break;
            } else if (a.ao(((nry) ugiVar.next()).c, "key_setting_mode")) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            bgzVar.set(iIntValue, nry.a((nry) bgzVar.get(iIntValue), e(nsuVar), false, c(nsuVar), null, false, 1006));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Object obj, boolean z) {
        bgz bgzVar = this.j;
        int i = 0;
        ugi ugiVar = new ugi(bgzVar, 0, 1);
        while (true) {
            if (!ugiVar.hasNext()) {
                i = -1;
                break;
            } else if (a.ao(((nry) ugiVar.next()).c, obj)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (z) {
                this.u.h(Integer.valueOf(iIntValue));
            }
            bgzVar.set(iIntValue, nry.a((nry) bgzVar.get(iIntValue), 0, false, 0, null, z, 511));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Object obj, boolean z) {
        bgz bgzVar = this.i;
        int i = 0;
        ugi ugiVar = new ugi(bgzVar, 0, 1);
        while (true) {
            if (!ugiVar.hasNext()) {
                i = -1;
                break;
            } else if (a.ao(((nry) ugiVar.next()).c, obj)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            bgzVar.set(iIntValue, nry.a((nry) bgzVar.get(iIntValue), 0, false, 0, null, z, 511));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(ltw ltwVar, boolean z) {
        bgz bgzVar = this.k;
        int i = 0;
        ugi ugiVar = new ugi(bgzVar, 0, 1);
        while (true) {
            if (!ugiVar.hasNext()) {
                i = -1;
                break;
            } else if (((nry) ugiVar.next()).c == ltwVar) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (z) {
                this.q.h(Integer.valueOf(iIntValue));
            }
            bgzVar.set(iIntValue, nry.a((nry) bgzVar.get(iIntValue), 0, false, 0, null, z, 511));
        }
    }

    public final void q(boolean z) {
        this.d.b(Boolean.valueOf(z));
    }

    public final boolean r() {
        return ((Boolean) this.w.a()).booleanValue();
    }

    public final boolean s() {
        return r() && this.g.a() == pka.BACK;
    }
}
