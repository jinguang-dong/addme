package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fkq implements nan, png {
    static final sbv a;
    private static final sbv c;
    public final Animator b;
    private final View d;
    private final owf e;
    private final int f;
    private final int g;
    private final ImageView h;
    private final TextView i;
    private Date j;
    private final ktx k;
    private final mwq l;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(tfc.NONE, Integer.valueOf(R.string.direction_none));
        sbrVar.f(tfc.LEFT, Integer.valueOf(R.string.direction_left));
        sbrVar.f(tfc.RIGHT, Integer.valueOf(R.string.direction_right));
        sbrVar.f(tfc.FORWARD, Integer.valueOf(R.string.direction_forward));
        sbrVar.f(tfc.BACKWARD, Integer.valueOf(R.string.direction_backward));
        sbrVar.f(tfc.UP, Integer.valueOf(R.string.direction_up));
        sbrVar.f(tfc.DOWN, Integer.valueOf(R.string.direction_down));
        tfc tfcVar = tfc.TURN_AROUND;
        Integer numValueOf = Integer.valueOf(R.string.direction_turn_around);
        sbrVar.f(tfcVar, numValueOf);
        sbrVar.f(tfc.POINT_AT_SCENE, numValueOf);
        sbrVar.f(tfc.POINT_AT_SCENE_CLOSE, numValueOf);
        a = sbrVar.b();
        sbr sbrVar2 = new sbr();
        sbrVar2.f(tfc.LEFT, Integer.valueOf(R.drawable.arrow_left));
        sbrVar2.f(tfc.RIGHT, Integer.valueOf(R.drawable.arrow_right));
        sbrVar2.f(tfc.FORWARD, Integer.valueOf(R.drawable.arrow_forward));
        sbrVar2.f(tfc.BACKWARD, Integer.valueOf(R.drawable.arrow_backward));
        sbrVar2.f(tfc.UP, Integer.valueOf(R.drawable.arrow_up));
        sbrVar2.f(tfc.DOWN, Integer.valueOf(R.drawable.arrow_down));
        c = sbrVar2.b();
    }

    public fkq(View view, tfc tfcVar, Animator animator, ktx ktxVar, owf owfVar, mwq mwqVar) {
        this.d = view;
        this.b = animator;
        this.k = ktxVar;
        this.e = owfVar;
        Integer num = (Integer) c.getOrDefault(tfcVar, 0);
        num.getClass();
        this.f = num.intValue();
        Integer num2 = (Integer) a.get(tfcVar);
        num2.getClass();
        this.g = num2.intValue();
        this.h = (ImageView) view.findViewById(R.id.arrow);
        this.i = (TextView) view.findViewById(R.id.notification_text);
        this.l = mwqVar;
    }

    @Override // defpackage.png
    public final void a(pao paoVar) {
        float f = paoVar.e;
        ImageView imageView = this.h;
        float rotation = imageView.getDisplay().getRotation();
        imageView.setPivotX(imageView.getWidth() * 0.5f);
        imageView.setPivotY(imageView.getHeight() * 0.5f);
        imageView.animate().rotation(-(f + (rotation * 90.0f)));
    }

    @Override // defpackage.imj
    public final int b() {
        return 0;
    }

    @Override // defpackage.imj
    public final imk c() {
        return imk.NOTIFICATION_CHIP;
    }

    @Override // defpackage.imj
    public final /* synthetic */ paq d() {
        return new fhf(12);
    }

    @Override // defpackage.imj
    public final /* synthetic */ Object e() {
        return new Object();
    }

    @Override // defpackage.imj
    public final /* synthetic */ Runnable f() {
        return null;
    }

    @Override // defpackage.imj
    public final Date g() {
        return this.j;
    }

    @Override // defpackage.imj
    public final void h(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // defpackage.imj
    public final void i() {
        this.h.setImageDrawable(null);
        this.d.setVisibility(8);
        this.k.h(this);
        Animator animator = this.b;
        animator.removeAllListeners();
        animator.end();
    }

    @Override // defpackage.imj
    public final void k(Date date) {
        this.j = date;
    }

    @Override // defpackage.imj
    public final void m() {
        new Date();
        int i = this.f;
        if (i != 0) {
            this.h.setImageResource(i);
            if (ValueAnimator.areAnimatorsEnabled()) {
                Animator animator = this.b;
                animator.addListener(new fkp(this));
                animator.start();
            }
        } else {
            this.h.setImageDrawable(null);
        }
        TextView textView = this.i;
        textView.setText(this.g);
        this.d.setVisibility(0);
        if (!((Boolean) this.e.dL()).booleanValue()) {
            this.l.h(textView.getText());
        }
        ktx ktxVar = this.k;
        ktxVar.c(this);
        a(ktxVar.a());
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.imj
    public final boolean q() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.imj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.imj
    public final int t() {
        return 2;
    }

    @Override // defpackage.imj
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.nan
    public final void l(String str) {
    }

    @Override // defpackage.imj
    public final /* synthetic */ void n(boolean z, boolean z2, boolean z3, mxm mxmVar, mxj mxjVar, Optional optional, boolean z4) {
    }
}
