package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.google.android.apps.camera.ui.elapsedtimeui.ElapsedTimerView;
import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtx implements mtw {
    private static final mtz a = mtz.a().a();
    private final boolean b;
    private owf c;
    private Optional d = Optional.empty();
    private mtz e = a;

    public mtx(hbj hbjVar) {
        this.b = hbjVar.p(gzo.bw);
    }

    private final boolean g() {
        owf owfVar = this.c;
        return owfVar != null && ((Boolean) owfVar.dL()).booleanValue();
    }

    @Override // defpackage.mtw
    public final void a() {
        if (this.d.isEmpty() || !g()) {
            return;
        }
        ((ElapsedTimerView) this.d.get()).setVisibility(8);
    }

    @Override // defpackage.mtw
    public final void b(mtz mtzVar) {
        this.e = mtzVar;
    }

    @Override // defpackage.mtw
    public final void c(ElapsedTimerView elapsedTimerView) throws Resources.NotFoundException {
        Drawable drawable;
        boolean z = this.b;
        Resources resources = elapsedTimerView.getResources();
        if (z) {
            drawable = resources.getDrawable(R.drawable.bg_elapsed_timer, null);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.timer_side_padding);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) elapsedTimerView.d().getLayoutParams();
            layoutParams.setMarginStart(dimensionPixelSize);
            layoutParams.setMarginEnd(dimensionPixelSize);
            elapsedTimerView.d().setLayoutParams(layoutParams);
        } else {
            drawable = resources.getDrawable(R.drawable.bg_elapsed_timer_legacy, null);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.timer_side_padding_legacy);
            elapsedTimerView.d().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        elapsedTimerView.a().setBackground(drawable);
        elapsedTimerView.d().setTextSize(0, resources.getDimensionPixelSize(R.dimen.elapsed_timer_text_size));
        this.d = Optional.of(elapsedTimerView);
    }

    @Override // defpackage.mtw
    public final void d(String str) {
        if (this.d.isEmpty() || !g()) {
            return;
        }
        ((ElapsedTimerView) this.d.get()).d().setText(str);
    }

    @Override // defpackage.mtw
    public final void e(owf owfVar) {
        this.c = owfVar;
    }

    @Override // defpackage.mtw
    public final void f() {
        if (this.d.isEmpty() || !g()) {
            return;
        }
        ((ElapsedTimerView) this.d.get()).setVisibility(0);
        ((ElapsedTimerView) this.d.get()).b().setVisibility(true != this.e.c ? 8 : 0);
    }
}
