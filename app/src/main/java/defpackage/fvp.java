package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.google.android.apps.camera.bottombar.CameraSwitchButton;
import com.google.android.apps.camera.bottombar.ThumbnailView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fvp implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fvp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        switch (this.b) {
            case 0:
                ((fvu) this.a).m.c();
                break;
            case 1:
                ((fvu) this.a).m.b();
                break;
            case 2:
                ((fvu) this.a).m.g();
                break;
            case 3:
                ((fvu) this.a).m.d();
                break;
            case 4:
                Object obj = this.a;
                CameraSwitchButton cameraSwitchButton = (CameraSwitchButton) obj;
                cameraSwitchButton.a = (Animatable) cameraSwitchButton.getDrawable();
                View.OnClickListener onClickListener = cameraSwitchButton.b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                syj.i((View) obj);
                Animatable animatable = cameraSwitchButton.a;
                if (animatable != null) {
                    animatable.start();
                    break;
                }
                break;
            case 5:
                if (view.isClickable()) {
                    ThumbnailView thumbnailView = (ThumbnailView) this.a;
                    if (thumbnailView.b.h()) {
                        mod modVar = (mod) ((rnu) thumbnailView.b.c()).a;
                        modVar.c = Long.valueOf(SystemClock.elapsedRealtime());
                        modVar.e(true);
                    }
                    if (thumbnailView.c.h()) {
                        ((View.OnClickListener) thumbnailView.c.c()).onClick(view);
                        break;
                    }
                }
                break;
            case 6:
                Intent intent = new Intent();
                guk gukVar = (guk) this.a;
                intent.setClassName(gukVar.a, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
                ((iso) gukVar.f.c()).r();
                gukVar.g.c(intent);
                break;
            case 7:
                guk gukVar2 = (guk) this.a;
                rnt.L(gukVar2.f.h());
                gukVar2.b.a();
                ((iso) gukVar2.f.c()).r();
                break;
            case 8:
                hie hieVar = (hie) this.a;
                hieVar.l(true, false);
                hieVar.g();
                hieVar.i(false);
                break;
            case 9:
                krj krjVar = (krj) this.a;
                krjVar.j.a();
                krjVar.B.a = true;
                break;
            case 10:
                this.a.run();
                break;
            case 11:
                ((Context) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                break;
            default:
                ((Context) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/photos/answer/10694388")));
                break;
        }
    }

    public fvp(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
