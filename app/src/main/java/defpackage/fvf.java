package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.camcorder.ui.modeslider.recordspeed.RecordSpeedSlider;
import com.google.android.apps.camera.composezoom.ZoomUi;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonImpl;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fvf implements View.OnLayoutChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, uiq] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Resources.NotFoundException {
        int i9 = this.b;
        if (i9 == 0) {
            ((AutoTimerIndicatorView) this.a).b(i, i2, i3, i4);
            return;
        }
        if (i9 == 1) {
            view.removeOnLayoutChangeListener(this);
            this.a.a(view);
            return;
        }
        if (i9 == 2) {
            RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recordSpeedSlider.getLayoutParams();
            Object obj = this.a;
            if (layoutParams != null) {
                if (((gln) obj).l) {
                    layoutParams.height = -2;
                    int dimensionPixelSize = recordSpeedSlider.getResources().getDimensionPixelSize(R.dimen.tablet_record_speed_slider_bottom_margin);
                    Rect rect = new Rect(i, i2, i3, i4);
                    Point point = new Point(i + (rect.width() / 2), i2 + (rect.height() / 2));
                    layoutParams.bottomMargin = dimensionPixelSize - (rect.bottom - new Rect(point.x - (rect.height() / 2), point.y - (rect.width() / 2), point.x + (rect.height() / 2), point.y + (rect.width() / 2)).bottom);
                } else {
                    layoutParams.width = -2;
                    layoutParams.bottomMargin = 0;
                }
                recordSpeedSlider.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams2 = ((ViewGroup) recordSpeedSlider.getParent()).getLayoutParams();
            if (layoutParams2 != null) {
                if (((gln) obj).l) {
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.height = -2;
                }
                ((ViewGroup) recordSpeedSlider.getParent()).setLayoutParams(layoutParams2);
            }
            szh szhVar = ((gln) obj).s;
            szhVar.getClass();
            szhVar.e(null);
            return;
        }
        if (i9 == 3) {
            ((gqq) this.a).a = true;
            return;
        }
        if (i9 == 4) {
            ZoomUi zoomUi = (ZoomUi) this.a;
            Rect rect2 = zoomUi.b;
            zoomUi.getGlobalVisibleRect(rect2);
            zoomUi.e().w = Integer.valueOf(rect2.left);
            return;
        }
        if (i9 != 5) {
            nae naeVar = (nae) this.a;
            View view2 = naeVar.g;
            if (view2 != null) {
                naeVar.g(view2);
                return;
            }
            return;
        }
        view.removeOnLayoutChangeListener(this);
        Object obj2 = this.a;
        OptionsEntryButtonImpl optionsEntryButtonImpl = (OptionsEntryButtonImpl) obj2;
        Object parent = optionsEntryButtonImpl.getParent();
        parent.getClass();
        nlj.j((View) parent, (View) obj2, optionsEntryButtonImpl.getResources().getDimensionPixelOffset(R.dimen.minibar_hit_rect_padding), optionsEntryButtonImpl.getResources().getDimensionPixelOffset(R.dimen.minibar_hit_rect_padding));
    }

    public fvf(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
