package defpackage;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Handler;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.ui.widget.TracedFrameLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mso extends TracedFrameLayout {
    public static final sgv a = sgv.g("mso");
    public final Handler b;
    public final ViewGroup c;
    public TextView d;
    public ImageView e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public msh j;
    public mwq k;
    private AnimatedVectorDrawable l;

    public final void b(final View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: msl
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    this.a.b(view);
                }
            });
            return;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(measuredWidth / 2.0f);
        view.setPivotY(measuredHeight / 2.0f);
        view.setAlpha(1.0f);
    }

    public final void c() {
        int i;
        ImageView imageView = this.e;
        if (imageView != null) {
            if (imageView.getMeasuredWidth() <= 0 || imageView.getMeasuredHeight() <= 0) {
                Choreographer.getInstance().postFrameCallback(new msm(this, 2));
                return;
            }
            b(imageView);
            switch (this.f) {
                case 1:
                    i = R.drawable.countdown_animation_1;
                    break;
                case 2:
                    i = R.drawable.countdown_animation_2;
                    break;
                case 3:
                    i = R.drawable.countdown_animation_3;
                    break;
                case 4:
                    i = R.drawable.countdown_animation_4;
                    break;
                case 5:
                    i = R.drawable.countdown_animation_5;
                    break;
                case 6:
                    i = R.drawable.countdown_animation_6;
                    break;
                case 7:
                    i = R.drawable.countdown_animation_7;
                    break;
                case 8:
                    i = R.drawable.countdown_animation_8;
                    break;
                case 9:
                    i = R.drawable.countdown_animation_9;
                    break;
                case 10:
                    i = R.drawable.countdown_animation_10;
                    break;
                default:
                    imageView.setImageDrawable(this.l);
                    this.l.start();
            }
            this.l = (AnimatedVectorDrawable) getResources().getDrawable(i, null);
            imageView.setImageDrawable(this.l);
            this.l.start();
        }
    }

    public final void d() {
        TextView textView = this.d;
        if (textView != null) {
            if (textView.getMeasuredWidth() <= 0 || textView.getMeasuredHeight() <= 0) {
                Choreographer.getInstance().postFrameCallback(new msm(this, 0));
            } else {
                b(textView);
                textView.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(800L).start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mso.a(boolean, int):void");
    }

    public mso(FrameLayout frameLayout) {
        super(frameLayout.getContext());
        this.b = new msn(this);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.i = true;
        this.c = frameLayout;
        setTag(MyBPCgKwEjJI.xmgFtHVyyDI);
        Object context = frameLayout.getContext();
        if (context instanceof fdi) {
            this.h = ((fdi) context).b().p(gzo.bw);
        }
        if (this.h) {
            ImageView imageView = new ImageView(frameLayout.getContext());
            ojl.bl(imageView);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.e);
            return;
        }
        TextView textView = new TextView(frameLayout.getContext(), null, R.style.CountdownTextStyle);
        ojl.bl(textView);
        this.d = textView;
        textView.setTextAppearance(R.style.CountdownTextStyle);
        this.d.setGravity(17);
        addView(this.d);
    }
}
