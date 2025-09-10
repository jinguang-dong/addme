package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.ar.core.R;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class huc {
    public static final sgv a = sgv.g("huc");
    public final owf b;
    public final owf c;
    public final hur d;
    public final owf e;
    public final out f;
    public final uem g;
    public final owf h;
    public final htp i;
    public final cwc j;
    public final uhf k;
    public ConstraintLayout l;
    public ImageView m;
    public View n;
    public InterleavedImageU8 o;
    public Rect p;
    public GLSurfaceView q;
    public View r;
    public cto s;
    public our t;
    public final ViewfinderCover u;
    public int v;
    public final cxb w;
    private final rww x;
    private final owq y;
    private final hup z;

    public huc(cxb cxbVar, rww rwwVar, owf owfVar, owf owfVar2, hur hurVar, owq owqVar, hup hupVar, owf owfVar3, out outVar, uem uemVar, owf owfVar4, htp htpVar, ezh ezhVar, cwc cwcVar, uhf uhfVar, ViewfinderCover viewfinderCover) {
        owfVar.getClass();
        owfVar2.getClass();
        hupVar.getClass();
        owfVar3.getClass();
        outVar.getClass();
        uemVar.getClass();
        owfVar4.getClass();
        htpVar.getClass();
        ezhVar.getClass();
        uhfVar.getClass();
        viewfinderCover.getClass();
        this.w = cxbVar;
        this.x = rwwVar;
        this.b = owfVar;
        this.c = owfVar2;
        this.d = hurVar;
        this.y = owqVar;
        this.z = hupVar;
        this.e = owfVar3;
        this.f = outVar;
        this.g = uemVar;
        this.h = owfVar4;
        this.i = htpVar;
        this.j = cwcVar;
        this.k = uhfVar;
        this.u = viewfinderCover;
        this.v = 1;
    }

    public static final boolean i(mxj mxjVar) {
        return mxjVar == mxj.TABLET_LAYOUT;
    }

    private static final void j(View view, uiq uiqVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        uiqVar.a(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public final float a(boolean z) {
        if (z) {
            return 0.0f;
        }
        ConstraintLayout constraintLayout = this.l;
        View view = null;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        int width = constraintLayout.getWidth();
        ConstraintLayout constraintLayout2 = this.l;
        if (constraintLayout2 == null) {
            ujp.c("container");
            constraintLayout2 = null;
        }
        int paddingLeft = width - constraintLayout2.getPaddingLeft();
        ConstraintLayout constraintLayout3 = this.l;
        if (constraintLayout3 == null) {
            ujp.c("container");
            constraintLayout3 = null;
        }
        int paddingRight = paddingLeft - constraintLayout3.getPaddingRight();
        View view2 = this.r;
        if (view2 == null) {
            ujp.c("ghostViewfinderContainer");
        } else {
            view = view2;
        }
        return paddingRight - view.getWidth();
    }

    public final void b() {
        if (this.z.i()) {
            return;
        }
        owq owqVar = this.y;
        Object objDL = owqVar.dL();
        ksa ksaVar = ksa.SERENGETI_MODE_DEFAULT;
        if (objDL == ksaVar) {
            owqVar.a(ksa.SERENGETI_MODE_ALTERNATE);
        } else {
            owqVar.a(ksaVar);
        }
    }

    public final void d(boolean z) {
        GLSurfaceView gLSurfaceView = null;
        if (z) {
            GLSurfaceView gLSurfaceView2 = this.q;
            if (gLSurfaceView2 == null) {
                ujp.c("ghostViewfinder");
            } else {
                gLSurfaceView = gLSurfaceView2;
            }
            gLSurfaceView.onResume();
            return;
        }
        hur hurVar = this.d;
        hurVar.d(false);
        hurVar.l = false;
        hurVar.m = Long.MAX_VALUE;
        GLSurfaceView gLSurfaceView3 = this.q;
        if (gLSurfaceView3 == null) {
            ujp.c("ghostViewfinder");
        } else {
            gLSurfaceView = gLSurfaceView3;
        }
        gLSurfaceView.onPause();
    }

    public final void e(boolean z) {
        ConstraintLayout constraintLayout = this.l;
        byte[] bArr = null;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = this.l;
        if (constraintLayout2 == null) {
            ujp.c("container");
            constraintLayout2 = null;
        }
        constraintLayout2.addOnLayoutChangeListener(new fjt(this, 4, null));
        long j = true != z ? 0L : 200L;
        View view = this.n;
        if (view == null) {
            ujp.c("background");
            view = null;
        }
        view.animate().alpha(1.0f).setDuration(j).start();
        d(true);
        our ourVar = this.t;
        if (ourVar != null) {
            View view2 = this.r;
            if (view2 == null) {
                ujp.c("ghostViewfinderContainer");
                view2 = null;
            }
            hbv hbvVar = new hbv(this, 18);
            view2.getClass();
            view2.postDelayed(hbvVar, j);
            ourVar.d(new loe(view2, hbvVar, 10, bArr));
        }
    }

    public final void g() {
        myd mydVar;
        Object objFr = this.x.fr();
        if (objFr == null || (mydVar = ((mxu) objFr).b) == null) {
            return;
        }
        ConstraintLayout constraintLayout = this.l;
        View view = null;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        int iT = mydVar.T(constraintLayout.getResources().getFloat(R.dimen.serengeti_preview_padding_proportion));
        ConstraintLayout constraintLayout2 = this.l;
        if (constraintLayout2 == null) {
            ujp.c("container");
            constraintLayout2 = null;
        }
        constraintLayout2.setPadding(iT, iT, iT, iT);
        View view2 = this.n;
        if (view2 == null) {
            ujp.c("background");
            view2 = null;
        }
        int iT2 = mydVar.T(view2.getResources().getFloat(R.dimen.serengeti_preview_height_proportion));
        View view3 = this.n;
        if (view3 == null) {
            ujp.c("background");
            view3 = null;
        }
        j(view3, new htz(iT2, 0));
        ImageView imageView = this.m;
        if (imageView == null) {
            ujp.c("livePreview");
            imageView = null;
        }
        j(imageView, new htz(iT2, 2));
        View view4 = this.r;
        if (view4 == null) {
            ujp.c("ghostViewfinderContainer");
        } else {
            view = view4;
        }
        j(view, new htz(iT2, 3));
    }

    public final void h(int i) {
        if (this.v == i) {
            return;
        }
        this.v = i;
        ConstraintLayout constraintLayout = this.l;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        constraintLayout.post(new cmu(i, this, 13));
    }

    public final void c(boolean z) {
        cto ctoVar = this.s;
        String str = pAAtrB.TTMoSL;
        cto ctoVar2 = null;
        if (ctoVar == null) {
            ujp.c(str);
            ctoVar = null;
        }
        ctoVar.c();
        float fA = a(z);
        View view = this.r;
        if (view == null) {
            ujp.c("ghostViewfinderContainer");
            view = null;
        }
        view.setTranslationX(fA);
        cto ctoVar3 = this.s;
        if (ctoVar3 == null) {
            ujp.c(str);
        } else {
            ctoVar2 = ctoVar3;
        }
        ctoVar2.s.d(fA);
    }

    public final void f() {
        float width;
        int iWidth;
        float width2;
        Rect rect = this.p;
        if (rect == null) {
            return;
        }
        Matrix matrix = new Matrix();
        int iWidth2 = rect.width();
        ImageView imageView = this.m;
        ImageView imageView2 = null;
        String str = qcjAcSmlN.qVBFCUQVantABzK;
        if (imageView == null) {
            ujp.c(str);
            imageView = null;
        }
        if (iWidth2 < imageView.getWidth()) {
            ImageView imageView3 = this.m;
            if (imageView3 == null) {
                ujp.c(str);
                imageView3 = null;
            }
            width = imageView3.getHeight();
            iWidth = rect.height();
        } else {
            ImageView imageView4 = this.m;
            if (imageView4 == null) {
                ujp.c(str);
                imageView4 = null;
            }
            width = imageView4.getWidth();
            iWidth = rect.width();
        }
        float f = width / iWidth;
        matrix.setScale(f, f);
        if (((huw) this.e.dL()).c) {
            width2 = -(rect.left * f);
        } else {
            ImageView imageView5 = this.m;
            if (imageView5 == null) {
                ujp.c(str);
                imageView5 = null;
            }
            width2 = imageView5.getWidth() - (rect.right * f);
        }
        ImageView imageView6 = this.m;
        if (imageView6 == null) {
            ujp.c(str);
            imageView6 = null;
        }
        matrix.postTranslate(width2, imageView6.getHeight() - (rect.bottom * f));
        ImageView imageView7 = this.m;
        if (imageView7 == null) {
            ujp.c(str);
        } else {
            imageView2 = imageView7;
        }
        imageView2.setImageMatrix(matrix);
    }
}
