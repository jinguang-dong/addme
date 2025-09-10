package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.camera.modeldownloader.uD.uCzt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class diz extends RecyclerView {
    final /* synthetic */ ViewPager2 ae;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diz(ViewPager2 viewPager2, Context context) {
        super(context);
        this.ae = viewPager2;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.ae.g && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.ae.g && super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return uCzt.RPzJ;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.ae;
        accessibilityEvent.setFromIndex(viewPager2.b);
        accessibilityEvent.setToIndex(viewPager2.b);
        accessibilityEvent.setSource(((dix) viewPager2.i).a);
        accessibilityEvent.setClassName(uCzt.sHERP);
    }
}
