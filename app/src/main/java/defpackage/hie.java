package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.widget.CheckBox;
import android.widget.ImageButton;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.ar.core.R;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hie implements paq, mxl {
    private nan A;
    private final imi C;
    public final Context a;
    public final owf e;
    public final owf f;
    public final owq g;
    public final owq h;
    public hil i;
    public hiq j;
    public EvCompView k;
    public ObjectAnimator l;
    public owq m;
    public nas n;
    public rwc o;
    public CheckBox p;
    public ImageButton q;
    public owf r;
    public nao s;
    public nao t;
    public hbj u;
    public oge v;
    private final Duration w;
    private final pbn y;
    public final owq b = new ovx(false);
    public final owq c = new ovx(false);
    public final owq d = new ovx(true);
    private Animator z = new AnimatorSet();
    private int B = 4000;
    private final our x = new our();

    public hie(Context context, pbn pbnVar, owf owfVar, owf owfVar2, owq owqVar, owq owqVar2, imi imiVar) {
        this.a = context;
        this.y = pbnVar;
        this.e = owfVar;
        this.f = owfVar2;
        this.g = owqVar;
        this.h = owqVar2;
        this.C = imiVar;
        this.w = Duration.ofMillis(context.getResources().getInteger(R.integer.reset_button_animation_duration_millis));
    }

    public final hil a() {
        hil hilVar = this.i;
        rnt.x(hilVar);
        return hilVar;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        hil hilVar = this.i;
        if (hilVar != null) {
            hilVar.b();
        }
        this.b.a(false);
        this.x.close();
    }

    public final void d() {
        pbn pbnVar = this.y;
        pbnVar.f("EvCompViewCtrl#disable");
        hil hilVar = this.i;
        if (hilVar != null) {
            hilVar.c();
        }
        pbnVar.g();
    }

    public final void e(int i, int i2, float f) {
        pbn pbnVar = this.y;
        pbnVar.f("EvCompViewCtrl#enable");
        a().d(i, i2, f);
        pbnVar.g();
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        EvCompView evCompView = this.k;
        evCompView.i = mxmVar;
        evCompView.e(mxmVar);
    }

    public final void f(boolean z) {
        nan nanVar = this.A;
        if (nanVar != null) {
            this.C.f(nanVar);
            this.A = null;
        }
        a().e(z);
    }

    public final void g() throws Resources.NotFoundException {
        ((lae) ((rwg) this.o).a).g();
        l(false, false);
        hiq hiqVar = this.j;
        if (hiqVar != null) {
            hiqVar.h();
        }
        if (((Boolean) ((ovx) this.d).d).booleanValue()) {
            return;
        }
        hiq hiqVar2 = this.j;
        rnt.x(hiqVar2);
        hiqVar2.k();
    }

    public final void h(boolean z) {
        this.n.k = z;
    }

    public final void i(boolean z) {
        owq owqVar = this.c;
        if (((Boolean) ((ovx) owqVar).d).booleanValue() == z) {
            return;
        }
        owqVar.a(Boolean.valueOf(z));
        if (z) {
            hiq hiqVar = this.j;
            rnt.x(hiqVar);
            hiqVar.e();
        }
        oge ogeVar = this.v;
        if (ogeVar != null) {
            if (((Boolean) ((luj) ogeVar.b).b(luf.aZ)).booleanValue()) {
                Object obj = ogeVar.a;
                if (z) {
                    owq owqVar2 = ((fcy) obj).a;
                    ovx ovxVar = (ovx) owqVar2;
                    fcx fcxVar = (fcx) ovxVar.d;
                    fcx fcxVar2 = fcx.AE_LOCKED;
                    if (fcxVar.equals(fcxVar2) || ((fcx) ovxVar.d).equals(fcx.AE_AF_LOCKED)) {
                        return;
                    }
                    owqVar2.a(fcxVar2);
                    return;
                }
                owq owqVar3 = ((fcy) obj).a;
                ovx ovxVar2 = (ovx) owqVar3;
                fcx fcxVar3 = (fcx) ovxVar2.d;
                fcx fcxVar4 = fcx.AE_UNLOCKED;
                if (fcxVar3.equals(fcxVar4) || ((fcx) ovxVar2.d).equals(fcx.UNLOCKED)) {
                    return;
                }
                owqVar3.a(fcxVar4);
            }
        }
    }

    public final void j(hhv hhvVar) throws Resources.NotFoundException {
        this.m.a(hhvVar);
        EvCompView evCompView = this.k;
        evCompView.b.a(hhvVar);
        if (((Boolean) evCompView.l.b(luf.aZ)).booleanValue()) {
            evCompView.l();
            evCompView.j();
            evCompView.k();
            ArrayList arrayList = evCompView.a;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    hhx hhxVar = (hhx) arrayList.get(i);
                    if (evCompView.e.indexOfChild(hhxVar) != -1) {
                        evCompView.e.removeView(hhxVar);
                    } else if (evCompView.f.indexOfChild(hhxVar) != -1) {
                        evCompView.f.removeView(hhxVar);
                    }
                }
                arrayList.clear();
            }
            int iOrdinal = hhvVar.ordinal();
            if (iOrdinal == 0) {
                evCompView.g = evCompView.n(hhy.BRIGHTNESS, R.drawable.quantum_gm_ic_brightness_medium_white_24, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.exposure_knob_description);
                evCompView.e.addView(evCompView.g);
                arrayList.add(evCompView.g);
                evCompView.e.setVisibility(0);
                evCompView.f.setVisibility(8);
            } else if (iOrdinal == 2) {
                evCompView.g = evCompView.n(hhy.BRIGHTNESS, R.drawable.ic_evc_brightness_24px, R.color.google_grey800, R.drawable.bg_evcomp_brightness_knob, R.string.brightness_knob_accessibility_description);
                evCompView.h = evCompView.n(hhy.SHADOW, R.drawable.ic_evc_shadow_24px, R.color.google_grey100, R.drawable.bg_evcomp_shadow_knob, R.string.shadow_knob_accessibility_description);
                evCompView.e.addView(evCompView.g);
                evCompView.f.addView(evCompView.h);
                arrayList.add(evCompView.g);
                arrayList.add(evCompView.h);
                evCompView.e.setVisibility(0);
                evCompView.f.setVisibility(0);
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                hhx hhxVar2 = (hhx) arrayList.get(i2);
                evCompView.d(hhxVar2, hhxVar2.d);
            }
        } else {
            evCompView.e.setVisibility(8);
            evCompView.f.setVisibility(8);
        }
        evCompView.invalidate();
        evCompView.requestLayout();
        hiq hiqVar = this.j;
        rnt.x(hiqVar);
        hiqVar.c();
        hiqVar.h();
        if (((Boolean) ((ovx) this.r).d).booleanValue()) {
            Iterator it = this.k.a.iterator();
            while (it.hasNext()) {
                ((hhx) it.next()).setOnTouchListener(new irl(this, hiqVar, 1));
            }
        }
    }

    public final void k(boolean z, boolean z2) throws Resources.NotFoundException {
        gzi gziVar = gzj.a;
        if (((Boolean) ((ovx) this.r).d).booleanValue() && !((Boolean) this.e.dL()).booleanValue()) {
            owf owfVar = this.f;
            jjq jjqVar = (jjq) owfVar.dL();
            if (jjqVar.f.isPresent() && jjqVar.g.isPresent()) {
                nao naoVar = this.m.dL() == hhv.SINGLE ? this.s : this.t;
                naoVar.b = this.B;
                imi imiVar = this.C;
                nan nanVarA = naoVar.a();
                imiVar.a(nanVarA);
                this.A = nanVarA;
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (this.m.dL() == hhv.SINGLE) {
                ((jjq) owfVar.dL()).i.ifPresent(new fxu(this, atomicBoolean, 2));
            } else {
                ((jjq) owfVar.dL()).b.ifPresent(new fxu(this, atomicBoolean, 3));
                ((jjq) owfVar.dL()).e.ifPresent(new fxu(this, atomicBoolean, 4));
            }
            l(false, atomicBoolean.get());
            Object obj = ((ovx) this.c).d;
            a().f(z, z2);
        }
    }

    public final void l(boolean z, boolean z2) throws Resources.NotFoundException {
        if (!z) {
            this.q.setAlpha(true == z2 ? 1.0f : 0.0f);
            this.q.setVisibility(true == z2 ? 0 : 8);
            return;
        }
        if (z2) {
            if (this.q.getAlpha() == 1.0f && this.q.getVisibility() == 0) {
                return;
            }
            this.z.cancel();
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(this.a, android.R.animator.fade_in);
            this.z = animatorLoadAnimator;
            animatorLoadAnimator.setDuration(this.w.toMillis());
            this.z.setTarget(this.q);
            this.z.addListener(new hic(this));
            this.z.start();
            return;
        }
        if (this.q.getAlpha() == 0.0f && this.q.getVisibility() == 8) {
            return;
        }
        this.z.cancel();
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.a, android.R.animator.fade_out);
        this.z = animatorLoadAnimator2;
        animatorLoadAnimator2.setDuration(this.w.toMillis());
        this.z.setTarget(this.q);
        this.z.addListener(new hid(this));
        this.z.start();
    }

    public final void m(int i) {
        if (((Boolean) ((ovx) this.r).d).booleanValue()) {
            hiq hiqVar = this.j;
            rnt.x(hiqVar);
            EvCompView evCompView = hiqVar.a;
            if (evCompView.getVisibility() == 0) {
                Runnable runnable = hiqVar.l;
                evCompView.removeCallbacks(runnable);
                evCompView.postDelayed(runnable, i);
            }
            this.B = i;
        }
    }

    public final nao n(int i) {
        nao naoVar = new nao();
        Context context = this.a;
        naoVar.e = context.getString(i);
        naoVar.h = context;
        naoVar.i = 2;
        return naoVar;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
