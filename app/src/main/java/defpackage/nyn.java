package defpackage;

import android.animation.TimeAnimator;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyn {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public AmbientModeSupport.AmbientController e;
    private final TimeAnimator f;

    public nyn(View view, View view2) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f = timeAnimator;
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: nyl
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                boolean zH;
                nyn nynVar = this.a;
                if (j - nynVar.d > 60) {
                    nynVar.d = j;
                    AmbientModeSupport.AmbientController ambientController = nynVar.e;
                    if (ambientController != null) {
                        if (nynVar.b) {
                            zH = ambientController.h();
                        } else if (!nynVar.c) {
                            return;
                        } else {
                            zH = ambientController.g();
                        }
                        if (zH) {
                            return;
                        }
                        nynVar.a();
                    }
                }
            }
        });
        view.setOnClickListener(new mlk(this, 20));
        view.setOnLongClickListener(new nym(this, 0));
        byte[] bArr = null;
        view.setOnTouchListener(new fuo(this, 14, bArr));
        view2.setOnClickListener(new rjd(this, 1));
        view2.setOnLongClickListener(new nym(this, 2));
        view2.setOnTouchListener(new fuo(this, 15, bArr));
    }

    public final void a() {
        this.b = false;
        this.c = false;
        TimeAnimator timeAnimator = this.f;
        if (timeAnimator.isStarted()) {
            timeAnimator.cancel();
        }
    }

    public final void b() {
        if (this.a) {
            if (!this.b && !this.c) {
                this.f.cancel();
            } else {
                this.d = 0L;
                this.f.start();
            }
        }
    }
}
