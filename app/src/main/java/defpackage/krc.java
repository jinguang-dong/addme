package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewManager;
import android.widget.ImageButton;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class krc implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ krc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    public krc(kvl kvlVar, int i) {
        this.b = i;
        this.a = kvlVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        szh szhVar;
        int i = 1;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                gok gokVar = new gok(obj, 17);
                krj krjVar = (krj) obj;
                Iterable$EL.forEach(krjVar.z, gokVar);
                krjVar.M.i(krjVar.q());
                return;
            case 1:
                krj krjVar2 = (krj) this.a;
                pbn pbnVar = krjVar2.e;
                pbnVar.f(zflNUOOzDfM.oSEtHCKv);
                nkw nkwVar = (nkw) krjVar2.c.dL();
                AtomicBoolean atomicBoolean = krjVar2.x;
                atomicBoolean.get();
                atomicBoolean.set(false);
                krjVar2.y.clear();
                boolean zIsEnabled = krjVar2.k.isEnabled();
                krjVar2.k.h();
                OptionsMenuContainer optionsMenuContainer = krjVar2.k;
                optionsMenuContainer.f = false;
                if (optionsMenuContainer.l()) {
                    ImageButton imageButton = optionsMenuContainer.c;
                    ((ViewManager) imageButton.getParent()).removeView(imageButton);
                }
                krjVar2.k.g();
                OptionsMenuContainer optionsMenuContainer2 = krjVar2.r;
                if (optionsMenuContainer2 != null) {
                    optionsMenuContainer2.g();
                    if (krjVar2.A) {
                        krjVar2.s.g();
                    }
                }
                if (nkwVar.d()) {
                    OptionsMenuContainer optionsMenuContainer3 = krjVar2.k;
                    kru kruVar = krjVar2.i;
                    optionsMenuContainer3.f = true;
                    Context context = optionsMenuContainer3.d;
                    int color = context.getResources().getColor(R.color.transparent, null);
                    ImageButton imageButton2 = optionsMenuContainer3.c;
                    imageButton2.setImageResource(com.google.ar.core.R.drawable.options_menu_close_button);
                    imageButton2.setContentDescription(context.getResources().getString(com.google.ar.core.R.string.accessibility_close_button));
                    imageButton2.setBackgroundColor(color);
                    imageButton2.setOnClickListener(new kcm(kruVar, 8));
                    imageButton2.setOnTouchListener(new nts(1));
                    if (optionsMenuContainer3.a != null) {
                        optionsMenuContainer3.k();
                    }
                }
                scn scnVar = krjVar2.z;
                krjVar2.f(Collection.EL.stream(scnVar));
                sgj sgjVarListIterator = scnVar.listIterator();
                while (sgjVarListIterator.hasNext()) {
                    krjVar2.o((krz) sgjVarListIterator.next());
                }
                if (zIsEnabled) {
                    krjVar2.k.i();
                }
                pbnVar.g();
                return;
            case 2:
                krj krjVar3 = (krj) this.a;
                if (krjVar3.t()) {
                    krjVar3.v(1);
                    return;
                } else {
                    krjVar3.x(1);
                    return;
                }
            case 3:
                Object obj2 = this.a;
                krj krjVar4 = (krj) obj2;
                Set set = krjVar4.y;
                scn scnVarF = scn.F(set);
                set.clear();
                Iterable$EL.forEach(scnVarF, new ird(obj2, 15));
                if (krjVar4.A) {
                    Iterable$EL.forEach(scnVarF, new ktp(obj2, i));
                }
                scn scnVar2 = krjVar4.z;
                krjVar4.f(Collection.EL.stream(scnVar2).filter(new glx(scnVarF, 9)));
                Collection.EL.stream(scnVar2).filter(new glx(scnVarF, 10)).forEach(new gok(obj2, 18));
                return;
            case 4:
                Object obj3 = this.a;
                synchronized (((pnk) obj3).c) {
                    int i2 = ((pnk) obj3).h;
                    if (i2 > 0) {
                        i2--;
                        ((pnk) obj3).h = i2;
                    }
                    if (i2 == 0) {
                        ((pnk) obj3).d.disable();
                    }
                }
                return;
            case 5:
                int i3 = kua.a;
                Context context2 = ((kud) this.a).a;
                lpa.q(3, new onm(context2), "com.google.android.apps.camera#".concat(String.valueOf(context2.getPackageName())), new AtomicBoolean(false));
                return;
            case 6:
                kva kvaVar = ((kuz) this.a).b;
                kvaVar.b();
                kvaVar.g(true, true, false);
                return;
            case 7:
                kva kvaVar2 = ((kuz) this.a).b;
                kvaVar2.b();
                kvaVar2.f.o(eoz.d());
                return;
            case 8:
                kva kvaVar3 = ((kuz) this.a).b;
                kvaVar3.b();
                kvaVar3.g(true, false, true);
                return;
            case 9:
                kva kvaVar4 = ((kuz) this.a).b;
                kvaVar4.b();
                kvaVar4.g(true, true, true);
                return;
            case 10:
                kva kvaVar5 = ((kuz) this.a).b;
                kvaVar5.b();
                kvaVar5.f.o(eoz.e());
                return;
            case 11:
                ((kva) this.a).b();
                return;
            case 12:
                kvl kvlVar = (kvl) this.a;
                kvlVar.a.b(kvlVar.c);
                return;
            case 13:
                kvo kvoVar = (kvo) this.a;
                if (((Boolean) ((ovx) kvoVar.b).d).booleanValue() || (szhVar = kvoVar.c) == null) {
                    return;
                }
                szhVar.e(null);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                kvv kvvVar = (kvv) this.a;
                fck fckVar = kvvVar.g;
                if (fckVar.a != nkw.NIGHT_SIGHT) {
                    fckVar.b(kvvVar.n);
                    return;
                }
                fbx fbxVar = kvvVar.h;
                fbxVar.d();
                fbxVar.b(kvvVar.n);
                return;
            case 15:
                ((mlw) ((kvu) this.a).d.a.c()).m(mlv.TOUCH_TO_FOCUS);
                return;
            case 16:
                ((kvu) this.a).d.o.o(eoz.d());
                return;
            case 17:
                ((mlw) ((kvu) this.a).d.a.c()).m(mlv.TOUCH_TO_FOCUS);
                return;
            case 18:
                kvv kvvVar2 = ((kvu) this.a).d;
                ((mlw) kvvVar2.a.c()).m(mlv.TOUCH_TO_FOCUS);
                kvvVar2.o.o(eoz.c());
                return;
            case 19:
                ((mlw) ((kvu) this.a).d.a.c()).m(mlv.TOUCH_TO_FOCUS);
                return;
            default:
                kvv kvvVar3 = ((kvu) this.a).d;
                ((mlw) kvvVar3.a.c()).m(mlv.TOUCH_TO_FOCUS);
                kvvVar3.o.o(eoz.e());
                return;
        }
    }
}
