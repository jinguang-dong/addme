package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbt implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener, nbo {
    public static final /* synthetic */ int a = 0;
    private final ConstraintLayout b;
    private final TextureView c;
    private final WindowManager d;
    private final TextureView.SurfaceTextureListener e;
    private final ArrayList f;
    private final mye g;
    private int h;
    private int i;
    private boolean j;
    private final RectF k;
    private int l;
    private Surface m;
    private SurfaceTexture n;

    public nbt(ConstraintLayout constraintLayout, mye myeVar, WindowManager windowManager, TextureView.SurfaceTextureListener surfaceTextureListener) {
        new ArrayList();
        this.f = new ArrayList();
        this.h = 0;
        this.i = 0;
        this.k = new RectF();
        this.l = -1;
        this.m = null;
        this.n = null;
        this.b = constraintLayout;
        constraintLayout.addOnLayoutChangeListener(this);
        TextureView textureView = new TextureView(constraintLayout.getContext());
        ojl.bl(textureView);
        this.c = textureView;
        textureView.setId(View.generateViewId());
        textureView.setSurfaceTextureListener(this);
        this.d = windowManager;
        this.g = myeVar;
        this.e = surfaceTextureListener;
    }

    @Override // defpackage.nbo
    public final int a() {
        return this.c.getHeight();
    }

    @Override // defpackage.nbo
    public final int b() {
        return this.c.getWidth();
    }

    @Override // defpackage.nbo
    public final rwc c(nmw nmwVar) {
        RectF rectF;
        int i;
        TextureView textureView = this.c;
        if (textureView == null) {
            rectF = new RectF();
        } else {
            Matrix matrix = new Matrix();
            RectF rectF2 = new RectF(0.0f, 0.0f, this.h, this.i);
            textureView.getTransform(matrix).mapRect(rectF2);
            rectF = rectF2;
        }
        int iMin = (int) Math.min(rectF.width(), rectF.height());
        int iMax = (int) Math.max(rectF.height(), rectF.width());
        int i2 = iMin / 2;
        if (i2 <= 0 || (i = iMax / 2) <= 0) {
            return rvk.a;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Surface surface = new Surface(textureView.getSurfaceTexture());
        synchronized (nmwVar) {
            PixelCopy.request(surface, bitmapCreateBitmap, nmwVar, nmwVar.a);
            nmwVar.b();
        }
        return rwc.j(ngq.b(bitmapCreateBitmap, 2));
    }

    @Override // defpackage.nbo
    public final syu d() {
        this.b.addView(this.c, 0);
        return ske.M(null);
    }

    @Override // defpackage.nbo
    public final syu e() {
        rnt.M(true, "Last Create Synchronization has not finished yet.");
        this.b.removeView(this.c);
        return ske.M(null);
    }

    @Override // defpackage.nbo
    public final void f() {
        Matrix matrix = new Matrix();
        TextureView textureView = this.c;
        textureView.setTransform(matrix);
        this.k.set(0.0f, 0.0f, this.h, this.i);
        textureView.post(new mub(new ArrayList(this.f), 18, null));
        if (this.h <= 0 || this.i <= 0) {
            return;
        }
        this.g.b().n();
    }

    @Override // defpackage.nbo
    public final void g() {
        this.c.requestLayout();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.c.getParent() == null) {
            return;
        }
        int i9 = i3 - i;
        int i10 = i4 - i2;
        mye myeVar = this.g;
        WindowManager windowManager = this.d;
        boolean zC = myeVar.c();
        int iCf = qpt.cf(windowManager);
        if (this.h == i9 && this.i == i10 && this.l == iCf && this.j == zC) {
            return;
        }
        this.h = i9;
        this.i = i10;
        this.l = iCf;
        this.j = zC;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.m = new Surface(surfaceTexture);
        this.n = surfaceTexture;
        this.e.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.e.onSurfaceTextureDestroyed(surfaceTexture);
        Surface surface = this.m;
        if (surface == null) {
            return false;
        }
        surface.release();
        this.m = null;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.e.onSurfaceTextureUpdated(surfaceTexture);
    }
}
