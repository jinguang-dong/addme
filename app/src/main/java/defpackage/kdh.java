package defpackage;

import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.android.apps.camera.ui.widget.ReviewImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdh {
    public final ReviewImageView a;
    public final ImageView b;
    public final iob c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    private final lsp i;
    private final FrameLayout j;
    private final owf k;
    private final ktx m;
    public int h = 178;
    private final lst l = new kdg(this);

    public kdh(iyu iyuVar, Resources resources, ktx ktxVar, lsp lspVar, owf owfVar, iob iobVar) {
        this.m = ktxVar;
        this.i = lspVar;
        MainActivityLayout mainActivityLayout = iyuVar.K.e;
        this.j = (FrameLayout) mainActivityLayout.findViewById(R.id.module_layout);
        this.a = new ReviewImageView(mainActivityLayout.getContext());
        ImageView imageView = new ImageView(mainActivityLayout.getContext());
        this.b = imageView;
        this.k = owfVar;
        this.c = iobVar;
        imageView.setImageDrawable(resources.getDrawable(R.drawable.review_image_overlay, null));
        imageView.setVisibility(8);
    }

    public final void a() {
        c();
        this.j.removeAllViews();
        this.i.i(this.l);
    }

    public final void b() {
        ReviewImageView reviewImageView = this.a;
        if (reviewImageView.getParent() == null) {
            this.j.addView(reviewImageView, 0);
        }
        ImageView imageView = this.b;
        if (imageView.getParent() == null) {
            this.j.addView(imageView, 1);
        }
        lsp lspVar = this.i;
        lst lstVar = this.l;
        lspVar.i(lstVar);
        lspVar.a(lstVar);
    }

    public final void c() {
        this.e = false;
        this.b.setVisibility(8);
        this.a.a();
        this.d = false;
    }

    public final void d(boolean z) {
        this.e = z;
        this.f = this.m.b().e;
        this.g = ((Integer) this.k.dL()).intValue();
    }

    public final void e(int i) {
        this.h = i;
        ImageView imageView = this.b;
        imageView.setVisibility(0);
        imageView.setImageAlpha(i);
    }
}
