package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.ar.core.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kef implements kek {
    public final Context a;
    public TextView b;
    public final mbj c;
    public final mwq d;
    private final out e;
    private final uem f;
    private View g;
    private LottieAnimationView h;
    private boolean i = false;
    private final luj j;

    public kef(out outVar, mbj mbjVar, Context context, uem uemVar, mwq mwqVar, luj lujVar) {
        this.e = outVar;
        this.c = mbjVar;
        this.a = context;
        this.f = uemVar;
        this.d = mwqVar;
        this.j = lujVar;
    }

    @Override // defpackage.kek
    public final void a(View view) {
        this.g = view;
        this.b = (TextView) view.findViewById(R.id.astro_countdown_text);
        this.h = (LottieAnimationView) view.findViewById(R.id.astro_animation);
        this.b.setOnHoverListener(new ked(this, 0));
        this.i = true;
        b();
    }

    @Override // defpackage.kek
    public final void b() {
        jsv.J(this.g != null, this.f);
        View view = this.g;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        this.b.setText("");
    }

    @Override // defpackage.kek
    public final void c(float f, Duration duration) {
        if (this.i) {
            this.e.c(new kee(this, duration, 0));
        }
    }

    @Override // defpackage.kek
    public final void d() {
        jsv.J(this.g != null, this.f);
        if (this.g != null) {
            if (((Boolean) this.j.b(luf.bd)).booleanValue()) {
                this.h.setVisibility(0);
            } else {
                this.h.setVisibility(8);
            }
            View view = this.g;
            view.getClass();
            view.setVisibility(0);
            this.d.h(this.a.getResources().getString(R.string.astro_capture_start_desc));
        }
    }
}
