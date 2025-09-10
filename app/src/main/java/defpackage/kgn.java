package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;
import j$.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgn {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    private Object e;

    public kgn(mni mniVar, ocq ocqVar, Context context) {
        this.e = null;
        this.d = null;
        this.c = mniVar;
        this.a = ocqVar;
        this.b = context;
        gzi gziVar = gzq.a;
    }

    private static final void c(EduImageView eduImageView, ImageButton imageButton) {
        byte[] bArr = null;
        eduImageView.setOnClickListener(new ipd(eduImageView, imageButton, 7, bArr));
        imageButton.setOnClickListener(new ipd(eduImageView, imageButton, 8, bArr));
    }

    public final pjr a() {
        Object obj = this.a;
        if (obj == null) {
            return null;
        }
        syu syuVarM = ske.M(obj);
        synchronized (this) {
            Object obj2 = this.d;
            if (obj2 != null) {
                ((kgl) obj2).b.isDone();
                syuVarM = ske.F(((kgl) obj2).b).a(new dyo(obj2, 15), sxo.a);
            }
        }
        return (pjr) ske.V(syuVarM);
    }

    public final void b() {
        out.a();
        if (this.e == null) {
            Context context = (Context) this.b;
            FrameLayout frameLayout = new FrameLayout(context);
            View viewInflate = View.inflate(context, R.layout.motion_photo_bottom_sheet_slider_style, frameLayout);
            this.e = viewInflate;
            EduImageView eduImageView = (EduImageView) viewInflate.findViewById(R.id.motion_photo_edu_video_1);
            eduImageView.c(context.getString(R.string.motion_photo_video_url_1), context.getString(R.string.reprocessing_video_label_1));
            ImageButton imageButton = (ImageButton) ((View) this.e).findViewById(R.id.motion_photo_edu_video_1_play_button);
            imageButton.setVisibility(8);
            c(eduImageView, imageButton);
            EduImageView eduImageView2 = (EduImageView) ((View) this.e).findViewById(R.id.motion_photo_edu_video_2);
            eduImageView2.c(context.getString(R.string.motion_photo_video_url_2), context.getString(R.string.reprocessing_video_label_3));
            ImageButton imageButton2 = (ImageButton) ((View) this.e).findViewById(R.id.motion_photo_edu_video_2_play_button);
            imageButton2.setVisibility(8);
            c(eduImageView2, imageButton2);
            this.e = frameLayout;
        }
        ((mni) this.c).m(7, R.string.motion_photos_bottomsheet_title, (View) this.e);
        ((ocq) this.a).ak("micro_tutorial_dismiss");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public kgn(fdq fdqVar, CameraManager cameraManager, pjp pjpVar, Executor executor) {
        pjr pjrVar;
        this.b = cameraManager;
        this.c = new szg(executor);
        Iterator it = pjpVar.h(pka.FRONT).iterator();
        while (true) {
            if (!it.hasNext()) {
                pjrVar = null;
                break;
            } else {
                pjrVar = (pjr) it.next();
                if (pjpVar.a(pjrVar).M()) {
                    break;
                }
            }
        }
        this.a = pjrVar;
        if (pjrVar != null) {
            scn scnVar = (scn) Collection.EL.stream(((pjn) pjpVar.a(pjrVar)).b).map(new jkv(8)).collect(ryv.b);
            this.d = new kgl(this, pjrVar, scnVar);
            this.e = new kgm(this, (kgl) this.d, pjrVar, scnVar);
            our ourVarJ = fdqVar.j();
            Object obj = this.e;
            obj.getClass();
            ((CameraManager) this.b).registerAvailabilityCallback((Executor) this.c, (CameraManager.AvailabilityCallback) obj);
            ourVarJ.d(new ffx(this, obj, 19, null));
        }
    }
}
