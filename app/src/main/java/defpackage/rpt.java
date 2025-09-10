package defpackage;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpt implements rpj {
    private final /* synthetic */ int a;
    private final ViewGroup b;

    public rpt(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.rpi
    public final void a(rpn rpnVar) {
        if (this.a != 0) {
            ((ViewPager) this.b).h(rpnVar.d);
        } else {
            ((ViewPager2) this.b).d(rpnVar.d, true);
        }
    }

    @Override // defpackage.rpi
    public final void b() {
    }

    @Override // defpackage.rpi
    public final void c() {
    }
}
