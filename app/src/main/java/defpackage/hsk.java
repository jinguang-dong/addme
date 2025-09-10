package defpackage;

import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hsk implements nkm {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ocq b;
    private final /* synthetic */ int c;

    public /* synthetic */ hsk(ocq ocqVar, Object obj, int i) {
        this.c = i;
        this.b = ocqVar;
        this.a = obj;
    }

    @Override // defpackage.nkm
    public final void a() {
        GLSurfaceView gLSurfaceView;
        if (this.c != 0) {
            ViewStub viewStub = (ViewStub) this.b.c(R.id.cottage_capture_preview_panel_stub);
            viewStub.setLayoutResource(R.layout.cottage_capture_preview_panel);
            View viewInflate = viewStub.inflate();
            Object obj = this.a;
            fif fifVar = (fif) obj;
            fifVar.a = viewInflate;
            fifVar.b = viewInflate.findViewById(R.id.capture_preview_first_photo_content);
            fifVar.c = (ImageView) viewInflate.findViewById(R.id.capture_preview_first_photo);
            fifVar.e = (ViewGroup) viewInflate.findViewById(R.id.capture_preview_second_photo_content);
            fifVar.g = (MaterialCardView) viewInflate.findViewById(R.id.capture_preview_second_photo_container);
            fifVar.l = (GLSurfaceView) viewInflate.findViewById(R.id.capture_preview_second_photo);
            fifVar.l.setEGLContextClientVersion(3);
            fifVar.l.getHolder().setFormat(1);
            fifVar.l.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
            fifVar.l.setRenderer(fifVar.m);
            fifVar.l.setRenderMode(1);
            fifVar.b(false);
            fifVar.l.setZOrderMediaOverlay(true);
            fifVar.f = viewInflate.findViewById(R.id.capture_preview_top_divider);
            fdq fdqVar = fifVar.n;
            fdqVar.j().d(fifVar.h.dK(new fbt(obj, 8), fifVar.j));
            fjt fjtVar = new fjt(obj, 1);
            fifVar.l.addOnLayoutChangeListener(fjtVar);
            fdqVar.j().d(new fid(obj, fjtVar, 0));
            return;
        }
        ViewStub viewStub2 = (ViewStub) this.b.c(R.id.serengeti_preview_container);
        viewStub2.setLayoutResource(R.layout.serengeti_preview);
        View viewInflate2 = viewStub2.inflate();
        viewInflate2.getClass();
        huc hucVar = (huc) this.a;
        hucVar.l = (ConstraintLayout) viewInflate2;
        ConstraintLayout constraintLayout = hucVar.l;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            ujp.c("container");
            constraintLayout = null;
        }
        hucVar.m = (ImageView) constraintLayout.findViewById(R.id.serengeti_live_preview);
        ConstraintLayout constraintLayout3 = hucVar.l;
        if (constraintLayout3 == null) {
            ujp.c("container");
            constraintLayout3 = null;
        }
        hucVar.n = constraintLayout3.findViewById(R.id.serengeti_preview_background);
        ConstraintLayout constraintLayout4 = hucVar.l;
        if (constraintLayout4 == null) {
            ujp.c("container");
            constraintLayout4 = null;
        }
        hucVar.r = constraintLayout4.findViewById(R.id.serengeti_ghost_viewfinder_container);
        ConstraintLayout constraintLayout5 = hucVar.l;
        if (constraintLayout5 == null) {
            ujp.c("container");
            constraintLayout5 = null;
        }
        hucVar.q = (GLSurfaceView) constraintLayout5.findViewById(R.id.serengeti_ghost_viewfinder);
        GLSurfaceView gLSurfaceView2 = hucVar.q;
        if (gLSurfaceView2 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView2 = null;
        }
        gLSurfaceView2.setEGLContextClientVersion(3);
        GLSurfaceView gLSurfaceView3 = hucVar.q;
        if (gLSurfaceView3 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView3 = null;
        }
        gLSurfaceView3.setZOrderMediaOverlay(true);
        GLSurfaceView gLSurfaceView4 = hucVar.q;
        if (gLSurfaceView4 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView4 = null;
        }
        gLSurfaceView4.getHolder().setFormat(1);
        GLSurfaceView gLSurfaceView5 = hucVar.q;
        if (gLSurfaceView5 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView = null;
        } else {
            gLSurfaceView = gLSurfaceView5;
        }
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 0, 0);
        GLSurfaceView gLSurfaceView6 = hucVar.q;
        if (gLSurfaceView6 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView6 = null;
        }
        gLSurfaceView6.setRenderer(hucVar.d);
        GLSurfaceView gLSurfaceView7 = hucVar.q;
        if (gLSurfaceView7 == null) {
            ujp.c("ghostViewfinder");
            gLSurfaceView7 = null;
        }
        gLSurfaceView7.setRenderMode(1);
        hucVar.d(false);
        View view = hucVar.r;
        if (view == null) {
            ujp.c("ghostViewfinderContainer");
            view = null;
        }
        cto ctoVar = new cto(view, cto.a, 0.0f);
        ctoVar.s.c(1.0f);
        hucVar.s = ctoVar;
        ConstraintLayout constraintLayout6 = hucVar.l;
        if (constraintLayout6 == null) {
            ujp.c("container");
        } else {
            constraintLayout2 = constraintLayout6;
        }
        constraintLayout2.setAccessibilityDelegate(new hua(hucVar));
    }
}
