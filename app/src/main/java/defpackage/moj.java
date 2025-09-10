package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class moj extends FrameLayout implements moo {
    public ImageView a;
    public CircularProgressIndicator b;
    public mon c;

    public moj(Context context) {
        super(context);
    }

    @Override // defpackage.moo
    public final void a() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.moo
    public final void b() {
        this.b.setVisibility(8);
    }

    public final void c() {
        setBackgroundResource(R.drawable.cvv_root_background);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        setClipToOutline(true);
    }

    @Override // defpackage.moo
    public final void d(mon monVar) {
        this.c = monVar;
    }

    @Override // defpackage.moo
    public final void e() {
        setBackgroundResource(R.drawable.cvv_root_background_left_right_rounded);
    }

    @Override // defpackage.moo
    public final void f() {
        setBackgroundResource(R.drawable.cvv_root_background_left_rounded);
    }

    @Override // defpackage.moo
    public final void g() {
        setBackgroundResource(R.drawable.cvv_root_background_right_rounded);
    }

    @Override // defpackage.moo
    public final void h() {
        this.b.setVisibility(8);
        this.a.setImageResource(R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_download_desc));
        this.a.setOnClickListener(new mlk(this, 4));
        this.a.setVisibility(0);
    }

    public final void i() {
        this.b.setVisibility(8);
        this.a.setImageResource(R.drawable.gm_filled_play_arrow_white_24);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_play_desc));
        this.a.setOnClickListener(new mlk(this, 5));
        this.a.setVisibility(0);
    }

    @Override // defpackage.moo
    public final void j() {
        this.a.setImageResource(R.drawable.quantum_gm_ic_get_app_white_24);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getResources().getString(R.string.cvv_download_desc));
        this.a.setOnClickListener(null);
        this.a.setVisibility(0);
        this.b.setVisibility(0);
    }

    public moj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public moj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
