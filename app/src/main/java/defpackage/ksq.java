package defpackage;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.optionsbar.view.OptionsEntryButtonImpl;
import com.google.android.apps.camera.optionsbar.view.OptionsPanelContent;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import com.google.ar.core.R;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksq implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ksq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) throws Resources.NotFoundException {
        int i;
        ?? r3 = 0;
        ImageView imageView = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                sgv sgvVar = ktb.a;
                ((krj) this.a).m(false, krs.BACK_PHOTO_FLASH);
                return;
            case 1:
                ((krn) this.a).f(true);
                return;
            case 2:
                sgv sgvVar2 = ktb.a;
                ((krj) this.a).m(false, krs.FRONT_PHOTO_FLASH);
                return;
            case 3:
                nkw nkwVar = (nkw) obj;
                OptionsEntryButtonImpl optionsEntryButtonImpl = (OptionsEntryButtonImpl) this.a;
                ImageView imageView2 = optionsEntryButtonImpl.d;
                if (imageView2 == null) {
                    ujp.c("icon");
                    imageView2 = null;
                }
                nkwVar.getClass();
                switch (nkwVar.ordinal()) {
                    case 1:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        i = R.drawable.gs_settings_photo_camera_vd_theme_24;
                        break;
                    case 2:
                    case 5:
                    case 8:
                    case 11:
                    case 13:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    case 19:
                        i = R.drawable.gs_settings_video_camera_vd_theme_24;
                        break;
                    case 9:
                    case 12:
                    default:
                        i = R.drawable.quantum_gm_ic_settings_white_24;
                        break;
                }
                imageView2.setImageResource(i);
                if (nkwVar == nkw.UNINITIALIZED) {
                    return;
                }
                String strC = nkt.a(nkwVar).c(optionsEntryButtonImpl.getResources());
                ImageView imageView3 = optionsEntryButtonImpl.d;
                if (imageView3 == null) {
                    ujp.c(VnmwoBe.ECjSokiLJgXjp);
                } else {
                    r3 = imageView3;
                }
                r3.setContentDescription(optionsEntryButtonImpl.getResources().getString(R.string.options_bottom_title, strC));
                return;
            case 4:
                mxm mxmVar = (mxm) obj;
                OptionsEntryButtonImpl optionsEntryButtonImpl2 = (OptionsEntryButtonImpl) this.a;
                ImageView imageView4 = optionsEntryButtonImpl2.d;
                if (imageView4 == null) {
                    ujp.c("icon");
                } else {
                    imageView = imageView4;
                }
                qpt.aR(imageView, mxmVar, optionsEntryButtonImpl2.e);
                optionsEntryButtonImpl2.e = false;
                return;
            case 5:
                OptionsPanelContent optionsPanelContent = (OptionsPanelContent) this.a;
                if (optionsPanelContent.h) {
                    optionsPanelContent.h = false;
                    optionsPanelContent.d();
                    optionsPanelContent.e();
                    return;
                }
                return;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    ((pfu) this.a).q(false, true, false);
                    return;
                }
                return;
            case 7:
                List list = (List) obj;
                float fFloatValue = ((Float) list.get(0)).floatValue();
                float fFloatValue2 = ((Float) list.get(1)).floatValue();
                lae laeVar = (lae) this.a;
                laeVar.b.a(laeVar.a(fFloatValue, fFloatValue2));
                return;
            case 8:
                List list2 = (List) obj;
                int iIntValue = ((Integer) list2.get(0)).intValue();
                Float f = (Float) list2.get(1);
                f.floatValue();
                ((qqq) this.a).c.a(new lax(iIntValue, sbp.m(f, Float.valueOf(0.0f))));
                return;
            case 9:
                List list3 = (List) obj;
                Float f2 = (Float) list3.get(0);
                if (Objects.equals(list3.get(1), kfe.RUNNING)) {
                    return;
                }
                ((ovx) this.a).a(f2);
                return;
            case 10:
                ((ovx) this.a).a(lnm.a(true != ((lel) obj).a ? 0 : 4));
                return;
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((rwr) this.a).c.a(bool);
                return;
            case 12:
                this.a.eH((mxm) obj);
                return;
            case 13:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj2 = this.a;
                if (zIsPresent) {
                    sbv sbvVar = lif.a;
                    if (sbvVar.containsKey(optional.get())) {
                        lie lieVar = (lie) sbvVar.get(optional.get());
                        if (lieVar != null) {
                            lif lifVar = (lif) obj2;
                            muu muuVar = lifVar.e;
                            muuVar.d(new ipd(obj2, lieVar, 10, r3), lieVar.d);
                            muuVar.h(obj2);
                            if (lifVar.h.ai(lieVar.f) > 0) {
                                return;
                            }
                            lifVar.a(lieVar);
                            return;
                        }
                        return;
                    }
                }
                ((lif) obj2).e.a(obj2);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jjq jjqVar = (jjq) obj;
                boolean z2 = jjqVar.b.isPresent() || jjqVar.e.isPresent() || jjqVar.i.isPresent();
                Object obj3 = this.a;
                lii liiVar = (lii) obj3;
                liiVar.b(z2, lih.EXPOSURE);
                liiVar.b(jjqVar.f.isPresent(), lih.ISO);
                liiVar.b(jjqVar.g.isPresent(), lih.SHUTTER_SPEED);
                int i2 = ((sfc) liiVar.a).c;
                ArrayList arrayList = liiVar.b;
                if (i2 - arrayList.size() < 2 || arrayList.isEmpty()) {
                    liiVar.c(true);
                    return;
                } else {
                    liiVar.c(false);
                    ((TextView) liiVar.c.c(R.id.reset_disabled_text)).setOnClickListener(new kcm(obj3, 9));
                    return;
                }
            case 15:
                List list4 = (List) obj;
                pka pkaVar = (pka) list4.get(0);
                Integer num = (Integer) list4.get(1);
                Integer num2 = (Integer) list4.get(2);
                jjq jjqVar2 = (jjq) list4.get(3);
                ?? r7 = this.a;
                if (pkaVar == pka.FRONT) {
                    r7.a(Boolean.valueOf(qpt.bT(num2)));
                    return;
                }
                if (!qpt.bT(num) && !jjqVar2.a.isPresent()) {
                    z = false;
                }
                r7.a(Boolean.valueOf(z));
                return;
            case 16:
                ((lit) this.a).i((lja) obj);
                return;
            case 17:
                lit litVar = (lit) this.a;
                litVar.i((lja) litVar.j.dL());
                return;
            case 18:
                pae paeVarI = pae.i((pas) obj);
                ljd ljdVar = ((lit) this.a).g;
                ljdVar.d = paeVarI;
                ljb ljbVar = (ljb) ljdVar.b.get();
                if (ljbVar != null) {
                    ljbVar.a = paeVarI;
                    return;
                }
                return;
            case 19:
                Object obj4 = this.a;
                jjq jjqVar3 = (jjq) obj;
                lle lleVar = (lle) obj4;
                lleVar.e();
                Optional optional2 = jjqVar3.g;
                optional2.ifPresent(new lji(obj4, 8));
                lleVar.k.setVisibility(true != optional2.isPresent() ? 0 : 4);
                Optional optional3 = jjqVar3.f;
                optional3.ifPresent(new lji(obj4, 7));
                lleVar.l.setVisibility(true != optional3.isPresent() ? 0 : 4);
                lleVar.c(jjqVar3.a, ((Boolean) ((ovx) ((FocusIndicatorView) lleVar.d.a()).j).d).booleanValue());
                return;
            default:
                Object obj5 = this.a;
                synchronized (((lqg) obj5).d) {
                    ((lqg) obj5).a();
                }
                return;
        }
    }
}
