package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndn implements ndj {
    public static final /* synthetic */ int i = 0;
    private static final sbp j = sbp.l(nkw.LENS);
    public final ShutterButton a;
    public final Object b;
    public final List c;
    boolean d;
    boolean e;
    public boolean f;
    public boolean g;
    public final nks h;
    private final out k;
    private final rwc l;
    private final ncq m;
    private final ShutterButtonProgressOverlay n;
    private final pbn o;
    private nkw p = nkw.PHOTO;
    private final tzj q;
    private ncn r;
    private final ndo s;
    private final ocq t;

    public ndn(ShutterButton shutterButton, out outVar, rwc rwcVar, ShutterButtonProgressOverlay shutterButtonProgressOverlay, nks nksVar, tzj tzjVar, ocq ocqVar, pbn pbnVar) {
        ndl ndlVar = new ndl(this);
        this.s = ndlVar;
        this.a = shutterButton;
        this.k = outVar;
        this.l = rwcVar;
        this.r = shutterButton.d();
        this.q = tzjVar;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        Object obj = new Object();
        this.b = obj;
        this.m = shutterButton.n ? new ndh(shutterButton) : new ndc(shutterButton);
        this.n = shutterButtonProgressOverlay;
        this.h = nksVar;
        this.t = ocqVar;
        this.o = pbnVar;
        shutterButton.d = ndlVar;
        e(new ndm(this));
        synchronized (obj) {
            this.d = shutterButton.isEnabled();
            this.e = shutterButton.b;
            boolean z = true;
            if (arrayList.size() != 1) {
                z = false;
            }
            rnt.M(z, "Expect only the pressedStateAnimation listener at this stage.");
        }
    }

    private final void aL(ncn ncnVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ncnVar.ordinal()) {
            case 0:
            case 3:
            case 5:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 20:
            case 25:
            case 27:
            case 30:
            case 44:
            case 51:
                this.r = ncnVar;
                break;
        }
    }

    private final void aM(ncn ncnVar) throws Resources.NotFoundException {
        aL(ncnVar);
        this.a.c(ncnVar, this.m);
        ((jmp) ((rwg) this.l).a).b(ncnVar);
        if (this.q != null) {
            aF(ncnVar.name().contains("IDLE"));
        }
    }

    @Override // defpackage.ndj
    public final void A() {
        this.a.performClick();
    }

    @Override // defpackage.ndj
    public final void B() {
        this.a.i();
    }

    @Override // defpackage.ndj
    public final void C() {
        aE(1.0f);
    }

    @Override // defpackage.ndj
    public final void D() {
        aE(1.0f);
        int i2 = ShutterButton.y;
        if (i2 == 3 || i2 == 1) {
            return;
        }
        ShutterButton.y = 3;
        ShutterButton.a.removeMessages(1001);
        ShutterButton.a.sendMessage(ShutterButton.a.obtainMessage(1000));
    }

    @Override // defpackage.ndj
    public final void E() throws Resources.NotFoundException {
        aM(ncn.PHOTO_IDLE);
    }

    @Override // defpackage.ndj
    public final void F() throws Resources.NotFoundException {
        aM(ncn.VIDEO_IDLE);
    }

    @Override // defpackage.ndj
    public final void G(boolean z) {
        this.a.k(z, this.m);
    }

    @Override // defpackage.ndj
    public final void H(boolean z) {
        this.a.h.set(z);
    }

    @Override // defpackage.ndj
    public final void I(ncm ncmVar) {
        this.a.s = ncmVar;
    }

    @Override // defpackage.ndj
    public final void J(int i2) {
        this.n.e(i2, -1L, false);
    }

    @Override // defpackage.ndj
    public final void K(int i2, long j2, boolean z) {
        this.n.e(i2, j2, z);
    }

    @Override // defpackage.ndj
    public final void L(int i2, long j2, boolean z, boolean z2, boolean z3, Optional optional, Optional optional2) {
        this.n.f(i2, j2, z, z2, z3, optional, optional2);
    }

    @Override // defpackage.ndj
    public final void M(boolean z) {
        aG(z, true);
    }

    @Override // defpackage.ndj
    public final void N() {
        aH(false, true, false, new ndk(4));
    }

    @Override // defpackage.ndj
    public final void O(boolean z) {
        aH(z, true, true, new ndk(0));
    }

    @Override // defpackage.ndj
    public final void P(boolean z, Runnable runnable) {
        aH(z, true, true, runnable);
    }

    @Override // defpackage.ndj
    public final void Q() throws Resources.NotFoundException {
        aM(ncn.COTTAGE_IDLE);
    }

    @Override // defpackage.ndj
    public final void R() throws Resources.NotFoundException {
        aM(ncn.COTTAGE_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void S() throws Resources.NotFoundException {
        aM(ncn.AUTOTIMER_RUNNING);
    }

    @Override // defpackage.ndj
    public final void T() throws Resources.NotFoundException {
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).f();
        }
        aM(ncn.CANCEL);
    }

    @Override // defpackage.ndj
    public final void U() throws Resources.NotFoundException {
        aM(ncn.SQUAD_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void V() throws Resources.NotFoundException {
        aM(ncn.VIDEO_PRESSED);
    }

    @Override // defpackage.ndj
    public final void W() throws Resources.NotFoundException {
        aK();
        aM(ncn.IMAX_RECORDING);
    }

    @Override // defpackage.ndj
    public final void X() throws Resources.NotFoundException {
        aM(ncn.PHOTO_LONGPRESS);
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).n();
        }
    }

    @Override // defpackage.ndj
    public final void Y() throws Resources.NotFoundException {
        O(true);
        aM(ncn.PHOTO_LONGPRESS_LOCKED);
    }

    @Override // defpackage.ndj
    public final void Z() throws Resources.NotFoundException {
        if (this.p == nkw.LANDSCAPE) {
            aM(ncn.LANDSCAPE_PROCESSING);
        } else {
            aM(ncn.ACTION_PAN_PROCESSING);
        }
    }

    @Override // defpackage.goh
    public final syu a(pka pkaVar) {
        M(false);
        return ske.M(null);
    }

    @Override // defpackage.ndj
    public final void aA() throws Resources.NotFoundException {
        aM(ncn.CONFIRM_ENABLED);
    }

    @Override // defpackage.ndj
    public final void aB() throws Resources.NotFoundException {
        if (this.a.d().equals(ncn.TIMELAPSE_IDLE)) {
            aM(ncn.LEOPARD_IDLE);
            tzj tzjVar = this.q;
            if (tzjVar != null) {
                ((nqp) tzjVar.a()).k();
            }
        }
    }

    @Override // defpackage.ndj
    public final void aC() throws Resources.NotFoundException {
        if (this.a.d().equals(ncn.LEOPARD_IDLE)) {
            aM(ncn.TIMELAPSE_IDLE);
            tzj tzjVar = this.q;
            if (tzjVar != null) {
                ((nqp) tzjVar.a()).t();
            }
        }
    }

    @Override // defpackage.ndj
    public final void aD() {
        int i2 = ShutterButton.y;
        if (i2 == 4 || i2 == 1) {
            return;
        }
        ShutterButton.a.sendMessage(ShutterButton.a.obtainMessage(1002));
    }

    final void aE(float f) {
        ShutterButton shutterButton = this.a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(shutterButton.i, f * shutterButton.a());
        valueAnimatorOfFloat.addUpdateListener(new cot(shutterButton, 14, null));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new cvn());
        valueAnimatorOfFloat.start();
    }

    public final void aF(boolean z) {
        tzj tzjVar = this.q;
        if (tzjVar == null) {
            return;
        }
        ((nqp) tzjVar.a()).z(z);
    }

    public final void aG(boolean z, boolean z2) {
        synchronized (this.b) {
            if (z2) {
                try {
                    this.e = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z3 = false;
            if (z && aI()) {
                z3 = true;
            }
            this.g = z3;
        }
        this.k.c(new mvn(this, 5));
    }

    public final void aH(boolean z, boolean z2, boolean z3, Runnable runnable) {
        pbp pbpVarA = this.o.a("ShutterButton#setEnabled");
        synchronized (this.b) {
            if (z2) {
                try {
                    this.d = z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean z4 = false;
            if (z && aI()) {
                z4 = true;
            }
            this.f = z4;
        }
        this.k.c(new hjq(this, z3, runnable, pbpVarA, 4));
    }

    public final boolean aI() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.c.size() <= 1) {
                z = false;
            }
        }
        return z;
    }

    public final boolean aJ() {
        ocq ocqVar = this.t;
        return ocqVar != null && ocqVar.aa();
    }

    final void aK() {
        this.a.setEnabled(true);
    }

    @Override // defpackage.ndj
    public final void aa() throws Resources.NotFoundException {
        aM(ncn.NIGHT_STOP);
    }

    @Override // defpackage.ndj
    public final void ab() throws Resources.NotFoundException {
        aM(ncn.NIGHT_CANCEL);
    }

    @Override // defpackage.ndj
    public final void ac() throws Resources.NotFoundException {
        aM(ncn.NIGHT_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void ad() throws Resources.NotFoundException {
        aM(ncn.CONFIRM_DISABLED);
    }

    @Override // defpackage.ndj
    public final void ae() throws Resources.NotFoundException {
        aM(ncn.CONFIRM_ENABLED);
    }

    @Override // defpackage.ndj
    public final void af() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PHOTO_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void ag() throws Resources.NotFoundException {
        aM(ncn.PHOTO_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void ah() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PORTRAIT_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void ai() throws Resources.NotFoundException {
        aM(ncn.VIDEO_PRESSED);
    }

    @Override // defpackage.ndj
    public final void aj() throws Resources.NotFoundException {
        aM(ncn.SERENGETI_RECORDING);
    }

    @Override // defpackage.ndj
    public final void ak() throws Resources.NotFoundException {
        aM(ncn.SERENGETI_PROCESSING);
    }

    @Override // defpackage.ndj
    public final void al() throws Resources.NotFoundException {
        aM(ncn.TIMELAPSE_PRESSED);
        ShutterButton shutterButton = this.a;
        if (ShutterButton.y == 1) {
            Arrays.fill(shutterButton.k, false);
            ShutterButton.a = new ncp(shutterButton);
        }
        shutterButton.u = 0;
        shutterButton.w = true;
        shutterButton.v = true;
        ShutterButton.y = 2;
        shutterButton.l.setColor(-1);
        shutterButton.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        shutterButton.l.setStyle(Paint.Style.STROKE);
        shutterButton.l.setStrokeWidth(nlj.b(2.3f));
    }

    @Override // defpackage.ndj
    public final void am() throws Resources.NotFoundException {
        aM(ncn.VIDEO_RECORDING);
    }

    @Override // defpackage.ndj
    public final void an() throws Resources.NotFoundException {
        aM(ncn.VIDEO_NIGHT_SIGHT_RECORDING);
    }

    @Override // defpackage.ndj
    public final void ao() throws Resources.NotFoundException {
        aM(ncn.AUTOTIMER_IDLE);
    }

    @Override // defpackage.ndj
    public final void ap() throws Resources.NotFoundException {
        if (this.a.n) {
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = this.r.ordinal();
            if (iOrdinal != 20 && iOrdinal != 25 && iOrdinal != 27 && iOrdinal != 30) {
                aM(this.r);
            }
        } else {
            aM(this.r);
        }
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).g();
        }
    }

    @Override // defpackage.ndj
    public final void aq() throws Resources.NotFoundException {
        aM(ncn.SLOW_MOTION_IDLE);
        aE(1.0f);
    }

    @Override // defpackage.ndj
    public final void ar() throws Resources.NotFoundException {
        if (aJ()) {
            this.a.setPressed(false);
        }
        aM(ncn.PHOTO_IDLE);
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).j();
        }
    }

    @Override // defpackage.ndj
    public final void as() throws Resources.NotFoundException {
        if (aJ()) {
            this.a.setPressed(false);
        }
        aM(ncn.PHOTO_IDLE);
    }

    @Override // defpackage.ndj
    public final void at() throws Resources.NotFoundException {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = this.p.ordinal();
        if (iOrdinal == 5) {
            aM(ncn.SLOW_MOTION_IDLE);
        } else if (iOrdinal == 13) {
            aM(ncn.AMBER_IDLE);
        } else if (iOrdinal != 14) {
            aM(ncn.VIDEO_IDLE);
        } else {
            aM(ncn.ROOSTER_IDLE);
        }
        aE(1.0f);
    }

    @Override // defpackage.ndj
    public final void au() throws Resources.NotFoundException {
        aM(ncn.TIMELAPSE_PROCESSING);
        if (ShutterButton.y == 1) {
            return;
        }
        ShutterButton shutterButton = this.a;
        ShutterButton.y = 1;
        ShutterButton.a.removeCallbacksAndMessages(null);
        shutterButton.u = 0;
        shutterButton.w = false;
        shutterButton.v = false;
        Arrays.fill(shutterButton.k, false);
        shutterButton.l.reset();
        shutterButton.l.setAntiAlias(true);
        shutterButton.l.setColor(0);
        shutterButton.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // defpackage.ndj
    public final void av() throws Resources.NotFoundException {
        aM(ncn.VIDEO_NIGHT_SIGHT_IDLE);
    }

    @Override // defpackage.ndj
    public final void aw(nkw nkwVar) throws Resources.NotFoundException {
        ShutterButton shutterButton = this.a;
        shutterButton.t = nkwVar;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        switch (nkwVar.ordinal()) {
            case 0:
            case 12:
                throw new IllegalStateException("Unsupported mode ".concat(String.valueOf(String.valueOf(nkwVar))));
            case 1:
                aM(shutterButton.e().C == ltw.AUTO ? ncn.AUTOTIMER_IDLE : ncn.PHOTO_IDLE);
                ((jmp) ((rwg) this.l).a).d();
                break;
            case 2:
            case 8:
                aM(ncn.VIDEO_IDLE);
                break;
            case 3:
                aM(ncn.IMAX_IDLE);
                break;
            case 4:
                aM(ncn.PHOTOSPHERE_IDLE);
                break;
            case 5:
                aM(ncn.SLOW_MOTION_IDLE);
                break;
            case 6:
                aM(ncn.PORTRAIT_IDLE);
                break;
            case 7:
                aM(ncn.PHOTO_IDLE);
                break;
            case 10:
                aM(ncn.NIGHT_IDLE);
                break;
            case 11:
                aM(ncn.TIMELAPSE_IDLE);
                break;
            case 13:
                aM(ncn.AMBER_IDLE);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                aM(ncn.ROOSTER_IDLE);
                break;
            case 15:
                aM(ncn.LANDSCAPE_IDLE);
                break;
            case 16:
                aM(ncn.ACTION_PAN_IDLE);
                break;
            case 17:
                aM(ncn.SERENGETI_IDLE);
                break;
            case 18:
                aM(ncn.COTTAGE_IDLE);
                ((jmp) ((rwg) this.l).a).d();
                break;
            case 19:
                aM(ncn.VIDEO_NIGHT_SIGHT_IDLE);
                break;
        }
        this.p = nkwVar;
        int i2 = true != j.contains(nkwVar) ? 0 : 4;
        if (i2 == shutterButton.getVisibility()) {
            return;
        }
        nnu.a(i2, shutterButton, true);
    }

    @Override // defpackage.ndj
    public final void ax() throws Resources.NotFoundException {
        aK();
        aM(ncn.CONFIRM_ENABLED);
    }

    @Override // defpackage.ndj
    public final void ay() throws Resources.NotFoundException {
        aM(ncn.TIMELAPSE_IDLE);
    }

    @Override // defpackage.ndj
    public final void az(ltw ltwVar) throws Resources.NotFoundException {
        ShutterButton shutterButton = this.a;
        if (shutterButton.n) {
            return;
        }
        ncn ncnVar = shutterButton.e().B;
        aL(ncnVar);
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ncnVar.ordinal()) {
            case 0:
            case 40:
                if (ltwVar != ltw.AUTO) {
                    shutterButton.o(ncn.PHOTO_IDLE, ltwVar, this.m);
                    break;
                } else {
                    shutterButton.o(ncn.AUTOTIMER_IDLE, ltwVar, this.m);
                    break;
                }
            case 3:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
            case 20:
            case 25:
            case 27:
            case 30:
            case 44:
            case 47:
            case 48:
            case 51:
                shutterButton.o(ncnVar, ltwVar, this.m);
                break;
        }
    }

    @Override // defpackage.ndj
    public final ShutterButton b() {
        return this.a;
    }

    @Override // defpackage.ndj
    public final paq c() {
        aH(false, false, true, new ndk(3));
        return new mpc(this, 7, null);
    }

    @Override // defpackage.ndj
    public final /* synthetic */ paq d() {
        M(true);
        return new ngh(this, 1);
    }

    @Override // defpackage.ndj
    public final paq e(ndo ndoVar) {
        synchronized (this.b) {
            this.c.add(ndoVar);
            if (aI()) {
                aH(this.d, false, true, new iyy(5));
                aG(this.e, false);
            }
        }
        return new ktu(this, ndoVar, 15);
    }

    @Override // defpackage.ndj
    public final void f() throws Resources.NotFoundException {
        aM(this.r);
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).g();
        }
    }

    @Override // defpackage.ndj
    public final void g() throws Resources.NotFoundException {
        aM(ncn.PHOTOSPHERE_IDLE);
    }

    @Override // defpackage.ndj
    public final void h() throws Resources.NotFoundException {
        aM(ncn.SERENGETI_RECORDING);
    }

    @Override // defpackage.ndj
    public final void i() throws Resources.NotFoundException {
        aM(ncn.ASTRO_IDLE);
        tzj tzjVar = this.q;
        if (tzjVar != null) {
            ((nqp) tzjVar.a()).h();
        }
    }

    @Override // defpackage.ndj
    public final void j() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PHOTO_IDLE);
    }

    @Override // defpackage.ndj
    public final void k() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // defpackage.ndj
    public final void l() throws Resources.NotFoundException {
        aM(ncn.SQUAD_IDLE);
    }

    @Override // defpackage.ndj
    public final void m() throws Resources.NotFoundException {
        aM(ncn.SERENGETI_IDLE);
    }

    @Override // defpackage.ndj
    public final void n() throws Resources.NotFoundException {
        aM(ncn.SERENGETI_NIGHT_IDLE);
    }

    @Override // defpackage.ndj
    public final void o() throws Resources.NotFoundException {
        aM(ncn.NIGHT_IDLE);
    }

    @Override // defpackage.ndj
    public final void p() throws Resources.NotFoundException {
        aw(nkw.COTTAGE);
    }

    @Override // defpackage.ndj
    public final void q() throws Resources.NotFoundException {
        aM(ncn.SQUAD_IDLE);
    }

    @Override // defpackage.ndj
    public final void r() throws Resources.NotFoundException {
        aM(ncn.IMAX_IDLE);
    }

    @Override // defpackage.ndj
    public final void s() throws Resources.NotFoundException {
        if (this.p == nkw.LANDSCAPE) {
            aM(ncn.LANDSCAPE_IDLE);
        } else {
            aM(ncn.ACTION_PAN_IDLE);
        }
    }

    @Override // defpackage.ndj
    public final void t() throws Resources.NotFoundException {
        aM(ncn.NIGHT_IDLE);
    }

    @Override // defpackage.ndj
    public final void u() throws Resources.NotFoundException {
        aM(ncn.PHOTOSPHERE_IDLE);
    }

    @Override // defpackage.ndj
    public final void v() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PHOTO_IDLE);
    }

    @Override // defpackage.ndj
    public final void w() throws Resources.NotFoundException {
        aM(ncn.CATSHARK_PORTRAIT_IDLE);
    }

    @Override // defpackage.ndj
    public final void x() {
        ShutterButtonProgressOverlay shutterButtonProgressOverlay = this.n;
        AnimatorSet animatorSet = shutterButtonProgressOverlay.l;
        if (animatorSet != null && animatorSet.isRunning()) {
            shutterButtonProgressOverlay.l.cancel();
        }
        ValueAnimator valueAnimator = shutterButtonProgressOverlay.m;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            shutterButtonProgressOverlay.m.cancel();
        }
        shutterButtonProgressOverlay.d();
        shutterButtonProgressOverlay.a = 0;
        shutterButtonProgressOverlay.b = 0.0f;
        shutterButtonProgressOverlay.i = false;
        shutterButtonProgressOverlay.f = true;
        shutterButtonProgressOverlay.o = 1;
        shutterButtonProgressOverlay.invalidate();
    }

    @Override // defpackage.ndj
    public final void y() {
        aE(0.8f);
    }

    @Override // defpackage.ndj
    public final void z() {
        aE(0.8f);
        int i2 = ShutterButton.y;
        if (i2 == 4 || i2 == 1) {
            return;
        }
        this.a.q();
    }
}
