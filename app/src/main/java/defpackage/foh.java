package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.camera.autotimer.analysis.jni.BaseCurator;
import com.google.ar.core.Anchor;
import com.google.ar.core.PointCloud;
import com.google.ar.core.R;
import com.google.ar.core.Session;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class foh implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public foh(fro froVar, int i) {
        this.b = i;
        this.a = froVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 20;
        int i2 = 13;
        int i3 = 17;
        byte[] bArr = null;
        int i4 = 1;
        switch (this.b) {
            case 0:
                ((Anchor) this.a).detach();
                break;
            case 1:
                Object obj = this.a;
                fng fngVar = (fng) obj;
                if (fngVar.f == null) {
                    View viewInflate = fngVar.b.inflate(R.layout.popup, fngVar.c, false);
                    fngVar.f = new PopupWindow(viewInflate, -2, -2);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.version_pop_up_desc);
                    Context context = fngVar.a;
                    textView.setText(context.getString(R.string.arcore_version_error_message, context.getString(R.string.mode_cottage)));
                    Button button = (Button) viewInflate.findViewById(R.id.update_button);
                    if (fngVar.d) {
                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.version_pop_up_dogfood);
                        textView2.setText(R.string.arcore_version_error_dogfood);
                        textView2.setVisibility(0);
                        fem femVar = new fem(context, i);
                        Button button2 = (Button) viewInflate.findViewById(R.id.dogfood_button);
                        button2.setOnClickListener(new gx(femVar, i3, bArr));
                        button2.setVisibility(0);
                        button.setBackground(context.getDrawable(R.drawable.button_background_accent));
                        button.setTextColor(context.getColor(android.R.color.system_text_primary_inverse_dark));
                    }
                    button.setOnClickListener(new gx(obj, 18, bArr));
                }
                PopupWindow popupWindow = fngVar.f;
                popupWindow.getClass();
                if (!popupWindow.isShowing()) {
                    PopupWindow popupWindow2 = fngVar.f;
                    popupWindow2.getClass();
                    popupWindow2.showAtLocation(fngVar.c, 17, 0, 0);
                    break;
                }
                break;
            case 2:
                ((PointCloud) this.a).release();
                break;
            case 3:
                ((Session) this.a).close();
                break;
            case 4:
                ((Session) this.a).pause();
                break;
            case 5:
                ((fro) this.a).a.close();
                break;
            case 6:
                fts ftsVar = (fts) this.a;
                ftsVar.e(ftsVar.a());
                break;
            case 7:
                ((kfa) this.a).f();
                break;
            case 8:
                Object obj2 = this.a;
                fuj fujVar = (fuj) obj2;
                rnt.M(fujVar.m == null, "Already started");
                rnt.M(!fujVar.o, "Cannot be started when closed");
                if (fujVar.l == null) {
                    fujVar.l = (BaseCurator) fujVar.e.a();
                }
                fujVar.n = fujVar.g.dK(new fpe(obj2, i2), fujVar.f);
                pfu pfuVar = fujVar.p;
                fujVar.m = pfuVar.c(pfuVar.d(fujVar.j), 1);
                fujVar.m.l(new iva(obj2, i4));
                break;
            case 9:
                fuj fujVar2 = (fuj) this.a;
                if (!fujVar2.o) {
                    fujVar2.o = true;
                    pdn pdnVar = fujVar2.m;
                    if (pdnVar != null) {
                        pdnVar.close();
                        fujVar2.m = null;
                    }
                    BaseCurator baseCurator = fujVar2.l;
                    if (baseCurator != null) {
                        baseCurator.close();
                        fujVar2.l = null;
                    }
                    paq paqVar = fujVar2.n;
                    if (paqVar != null) {
                        paqVar.close();
                        break;
                    }
                }
                break;
            case 10:
                fvc fvcVar = (fvc) this.a;
                fvd fvdVar = fvcVar.b;
                fvdVar.animate().withStartAction(new foh(fvdVar, 12)).alpha(1.0f).setDuration(fvdVar.getResources().getInteger(R.integer.autotimer_tutorial_background_anim_duration)).start();
                fvb fvbVar = fvcVar.c;
                AnimatorSet animatorSet = fvbVar.c;
                AnimatorSet animatorSetClone = animatorSet.clone();
                animatorSetClone.setTarget(fvbVar.a);
                AnimatorSet animatorSetClone2 = animatorSet.clone();
                animatorSetClone2.setTarget(fvbVar.b);
                AnimatorSet animatorSet2 = fvbVar.g;
                if (animatorSet2 != null) {
                    rnt.x(animatorSet2);
                    animatorSet2.end();
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(animatorSetClone).after(fvbVar.getResources().getInteger(R.integer.autotimer_tutorial_text_title_delay));
                animatorSet3.play(animatorSetClone2).after(fvbVar.getResources().getInteger(R.integer.autotimer_tutorial_text_body_delay));
                animatorSet3.addListener(new fuz(fvbVar));
                animatorSet3.setInterpolator(fvbVar.f);
                animatorSet3.start();
                fvbVar.g = animatorSet3;
                break;
            case 11:
                fvc fvcVar2 = (fvc) this.a;
                fvd fvdVar2 = fvcVar2.b;
                fvdVar2.animate().alpha(0.0f).withEndAction(new foh(fvdVar2, i2)).setDuration(fvdVar2.getResources().getInteger(R.integer.autotimer_tutorial_background_anim_duration)).start();
                fvb fvbVar2 = fvcVar2.c;
                if (fvbVar2.getVisibility() != 8) {
                    AnimatorSet animatorSet4 = fvbVar2.d;
                    AnimatorSet animatorSetClone3 = animatorSet4.clone();
                    animatorSetClone3.setTarget(fvbVar2.a);
                    AnimatorSet animatorSetClone4 = animatorSet4.clone();
                    animatorSetClone4.setTarget(fvbVar2.b);
                    AnimatorSet animatorSet5 = fvbVar2.g;
                    if (animatorSet5 != null) {
                        rnt.x(animatorSet5);
                        animatorSet5.end();
                    }
                    AnimatorSet animatorSet6 = new AnimatorSet();
                    animatorSet6.setInterpolator(fvbVar2.e);
                    animatorSet6.play(animatorSetClone3).after(fvbVar2.getResources().getInteger(R.integer.autotimer_tutorial_text_body_delay));
                    animatorSet6.play(animatorSetClone4).after(fvbVar2.getResources().getInteger(R.integer.autotimer_tutorial_text_title_delay));
                    animatorSet6.addListener(new fva(fvbVar2));
                    animatorSet6.start();
                    fvbVar2.g = animatorSet6;
                    break;
                }
                break;
            case 12:
                fvd fvdVar3 = (fvd) this.a;
                fvdVar3.setAlpha(0.0f);
                fvdVar3.setVisibility(0);
                break;
            case 13:
                ((fvd) this.a).setVisibility(8);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((fwn) this.a).c(gnm.CAMERA_SWITCH);
                break;
            case 15:
                ((fwn) ((iqw) this.a).a).g(false);
                break;
            case 16:
                Object obj3 = this.a;
                gnt gntVar = ((fwn) ((iqw) obj3).a).c;
                gntVar.e(gntVar.a());
                gntVar.h(new foh(obj3, i3));
                break;
            case 17:
                ((fwn) ((iqw) this.a).a).c(gnm.FALLBACK);
                break;
            case 18:
                gbb gbbVar = ((fyd) this.a).e;
                gbbVar.c.execute(new fxs(gbbVar, i));
                break;
            case 19:
                gbb gbbVar2 = ((fyd) this.a).e;
                gbbVar2.c.execute(new gba(gbbVar2, 3));
                break;
            default:
                fxm fxmVar = (fxm) this.a;
                fxmVar.b();
                fxmVar.d.m();
                break;
        }
    }

    public /* synthetic */ foh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
