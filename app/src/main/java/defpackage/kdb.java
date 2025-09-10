package defpackage;

import android.content.Context;
import android.os.CountDownTimer;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdb extends nak implements paq {
    public final out a;
    public final List b;
    public nan c;
    public nan d;
    public nan e;
    public nan f;
    public nan g;
    public nan h;
    public final syu i;
    private final mmk m;
    private CountDownTimer n;

    public kdb(Context context, out outVar, syu syuVar, mmk mmkVar) {
        super(context);
        this.b = new ArrayList();
        this.a = outVar;
        this.i = syuVar;
        this.m = mmkVar;
    }

    public final void a() {
        CountDownTimer countDownTimer = this.n;
        if (countDownTimer != null) {
            countDownTimer.onFinish();
            this.n.cancel();
        }
        f();
    }

    @Override // defpackage.nak
    public final void d() {
        super.d();
        Context context = this.j;
        nan nanVarJ = j(context.getString(R.string.cuttlefish_capture_text_1), 4000, 10);
        List list = this.b;
        list.add(nanVarJ);
        list.add(j(context.getString(R.string.cuttlefish_capture_text_2), 4000, 10));
        this.d = j(context.getString(R.string.cuttlefish_capture_text_3), 4000, 10);
        j(context.getString(R.string.cuttlefish_stable_text), -1, 8);
        this.c = j(context.getString(R.string.cuttlefish_almost_stable_text), -1, 8);
        this.e = j(context.getString(R.string.cuttlefish_zoom_advice_text), -1, 8);
        this.f = j(context.getString(R.string.astro_stabilization_timer_text), 4000, 8);
        this.g = j(context.getString(R.string.astro_too_bright_text), 3000, 8);
        this.h = j(context.getString(R.string.astro_unstable_text), 3000, 8);
    }

    public final void e() {
        fel felVar = (fel) ojl.ci(this.i);
        if (felVar != null) {
            felVar.b();
        }
        mmk mmkVar = this.m;
        if (!mmkVar.b.get() || mmkVar.a.get() || !mmkVar.d.get() || mmkVar.c.get()) {
            mmkVar.c();
        }
        kda kdaVar = new kda(this);
        this.n = kdaVar;
        kdaVar.start();
    }
}
