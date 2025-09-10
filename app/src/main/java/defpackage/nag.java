package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nag extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    public long b;
    public final /* synthetic */ ModeSwitcher c;
    public nkw a = nkw.UNINITIALIZED;
    public int d = 1;
    private ctl e = new ctl(new ctn(0.0f));

    public nag(ModeSwitcher modeSwitcher) {
        this.c = modeSwitcher;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a = this.c.g;
        this.b = motionEvent.getEventTime();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        ModeSwitcher modeSwitcher = this.c;
        nkw nkwVar = modeSwitcher.h;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        if (!nkwVar.equals(nkwVar2)) {
            modeSwitcher.g = modeSwitcher.h;
            modeSwitcher.h = nkwVar2;
        }
        this.e.c();
        float scrollX = modeSwitcher.getScrollX();
        float fA = -f;
        if (Math.abs(fA) > 15000.0f) {
            f3 = 0.1f;
        } else {
            rnt.F(true, "absMaxVelocity %s must be non-negative", Float.valueOf(1300.0f));
            fA = ModeSwitcher.a(fA, -1300.0f, 1300.0f);
            f3 = 15.0f;
        }
        float width = modeSwitcher.b.getWidth();
        float width2 = modeSwitcher.getWidth();
        float f4 = width - width2;
        if (f4 < 0.0f) {
            ((sgt) ModeSwitcher.a.c().M(5244)).N(width, width2);
            f4 = 0.0f;
        }
        ctl ctlVar = new ctl(new ctn(ModeSwitcher.a(scrollX, 0.0f, f4)));
        ctlVar.p = 0.0f;
        ctlVar.o = f4;
        ctlVar.s.a = f3 * (-4.2f);
        ctlVar.i = fA;
        ctlVar.j(new dtg(this, 3));
        ctlVar.i(new fvy(this, 3));
        this.e = ctlVar;
        ctlVar.g();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        sgv sgvVar = ModeSwitcher.a;
        ModeSwitcher modeSwitcher = this.c;
        nkw nkwVarD = modeSwitcher.d();
        if (modeSwitcher.h.equals(nkw.UNINITIALIZED) || modeSwitcher.h.equals(nkwVarD)) {
            modeSwitcher.h = nkwVarD;
            return false;
        }
        modeSwitcher.h = nkwVarD;
        syj.i(modeSwitcher);
        modeSwitcher.b.f(nkwVarD);
        this.d = motionEvent2.getEventTime() - this.b >= 500 ? 6 : 5;
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        sgv sgvVar = ModeSwitcher.a;
        ModeSwitcher modeSwitcher = this.c;
        if (!modeSwitcher.e) {
            nkw nkwVar = modeSwitcher.h;
            nkw nkwVar2 = nkw.UNINITIALIZED;
            if (!nkwVar.equals(nkwVar2)) {
                modeSwitcher.b.c(modeSwitcher.g, false);
                modeSwitcher.h = nkwVar2;
            }
            return true;
        }
        if (modeSwitcher.c.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        nkw nkwVarD = modeSwitcher.d();
        modeSwitcher.getScrollX();
        modeSwitcher.getScrollY();
        modeSwitcher.j(6, this.a, nkwVarD);
        nkw nkwVar3 = nkw.UNINITIALIZED;
        this.a = nkwVar3;
        this.b = 0L;
        modeSwitcher.h = nkwVar3;
        return true;
    }
}
