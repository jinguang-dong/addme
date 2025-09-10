package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oer {
    public Object a;
    public Object b;

    public final oes a() {
        if (this.b == null) {
            this.b = new ojl();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new oes((ojl) this.b, (Looper) this.a);
    }

    public final void b(int i) throws Resources.NotFoundException {
        int i2;
        out.a();
        Object obj = this.b;
        if (obj != null) {
            String strBy = qpt.by(i);
            Object tag = ((SmartsChipView) obj).getTag();
            if (i == 0) {
                throw null;
            }
            if (tag == strBy) {
                return;
            }
        }
        Object obj2 = this.a;
        rnt.w(obj2, "SmartsChipViewController is not yet initialized", new Object[0]);
        Object obj3 = this.b;
        if (obj3 != null) {
            ((FrameLayout) obj2).removeView((View) obj3);
        }
        FrameLayout frameLayout = (FrameLayout) obj2;
        int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.smarts_notification_chip_touch_target_height);
        String strBy2 = qpt.by(i);
        if (i == 0) {
            throw null;
        }
        if (i == 2) {
            dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(R.dimen.smarts_notification_lens_suggestion_chip_touch_target_height);
            i2 = R.layout.lens_suggestion_smarts_chip_view;
        } else {
            i2 = R.layout.default_smarts_chip_view;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, dimensionPixelSize, 80);
        SmartsChipView smartsChipView = (SmartsChipView) LayoutInflater.from(frameLayout.getContext()).inflate(i2, (ViewGroup) obj2, false);
        this.b = smartsChipView;
        smartsChipView.setLayoutParams(layoutParams);
        ((SmartsChipView) this.b).setTag(strBy2);
        frameLayout.addView((View) this.b);
    }
}
