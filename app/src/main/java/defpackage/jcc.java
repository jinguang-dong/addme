package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.google.android.apps.camera.progressoverlay.ProgressOverlay;
import com.google.android.apps.camera.ui.views.ViewfinderCover;
import com.google.android.apps.camera.ui.widget.ReviewImageView;
import com.google.ar.core.R;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jcc {
    public static final sgv a = sgv.g("jcc");
    public final msh b;
    public final Executor c;
    public final ReviewImageView d;
    public final ProgressOverlay e;
    public boolean f = false;
    public final fqy g;
    private final mwq h;

    public jcc(fqy fqyVar, View view, Executor executor, msh mshVar, mwq mwqVar) {
        this.g = fqyVar;
        this.b = mshVar;
        this.c = executor;
        this.h = mwqVar;
        ((ViewStub) view.findViewById(R.id.camera_intent_layout_stub)).inflate();
        this.d = (ReviewImageView) view.findViewById(R.id.intent_review_imageview);
        this.e = (ProgressOverlay) view.findViewById(R.id.intent_progress_bar);
        ((ViewfinderCover) view.findViewById(R.id.viewfinder_cover)).q = false;
    }

    public final void a(boolean z) {
        out.a();
        this.g.m(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f A[Catch: all -> 0x0041, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x0027, B:12:0x001b), top: B:19:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[Catch: all -> 0x0041, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x000f, B:13:0x0027, B:12:0x001b), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(android.graphics.Bitmap r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto La
            boolean r0 = r1.f     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L8
            goto La
        L8:
            monitor-exit(r1)
            return
        La:
            defpackage.out.a()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L1b
            com.google.android.apps.camera.progressoverlay.ProgressOverlay r3 = r1.e     // Catch: java.lang.Throwable -> L41
            r0 = 0
            r3.setVisibility(r0)     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.AnimatedVectorDrawable r3 = r3.a     // Catch: java.lang.Throwable -> L41
            r3.start()     // Catch: java.lang.Throwable -> L41
            goto L27
        L1b:
            com.google.android.apps.camera.progressoverlay.ProgressOverlay r3 = r1.e     // Catch: java.lang.Throwable -> L41
            android.graphics.drawable.AnimatedVectorDrawable r0 = r3.a     // Catch: java.lang.Throwable -> L41
            r0.stop()     // Catch: java.lang.Throwable -> L41
            r0 = 8
            r3.setVisibility(r0)     // Catch: java.lang.Throwable -> L41
        L27:
            r3 = 1
            r1.f = r3     // Catch: java.lang.Throwable -> L41
            com.google.android.apps.camera.ui.widget.ReviewImageView r3 = r1.d     // Catch: java.lang.Throwable -> L41
            r3.b(r2)     // Catch: java.lang.Throwable -> L41
            mwq r2 = r1.h     // Catch: java.lang.Throwable -> L41
            android.content.Context r3 = r3.getContext()     // Catch: java.lang.Throwable -> L41
            r0 = 2132018515(0x7f140553, float:1.9675339E38)
            java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.Throwable -> L41
            r2.h(r3)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)
            return
        L41:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcc.b(android.graphics.Bitmap, boolean):void");
    }

    public final boolean c() {
        return this.b.d();
    }
}
