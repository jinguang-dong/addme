package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptp extends uht implements uiu {
    final /* synthetic */ Context a;
    final /* synthetic */ ContentResolver b;
    final /* synthetic */ String c;
    final /* synthetic */ CancellationSignal d;
    final /* synthetic */ ceo e;
    final /* synthetic */ uon f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptp(Context context, ContentResolver contentResolver, String str, CancellationSignal cancellationSignal, ceo ceoVar, uon uonVar, uhb uhbVar) {
        super(2, uhbVar);
        this.a = context;
        this.b = contentResolver;
        this.c = str;
        this.d = cancellationSignal;
        this.e = ceoVar;
        this.f = uonVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ptp) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        rnt.aN(obj);
        try {
            ptq ptqVar = ptq.a;
            Context context = this.a;
            ContentResolver contentResolver = this.b;
            String str = this.c;
            CancellationSignal cancellationSignal = this.d;
            pth pthVarA = ptg.a(contentResolver, "name=Google Sans Flex&weight=400", str, cancellationSignal);
            ceo ceoVar = this.e;
            ptm ptmVar = (ptm) ceoVar;
            pth pthVarA2 = ptg.a(contentResolver, ptmVar.i, str, cancellationSignal);
            FontFamily.Builder builderH = prh.h(context, pthVarA, ptmVar, cancellationSignal);
            FontFamily fontFamilyBuild = builderH != null ? builderH.build() : null;
            FontFamily.Builder builderH2 = prh.h(context, pthVarA2, ptmVar, cancellationSignal);
            FontFamily fontFamilyBuild2 = builderH2 != null ? builderH2.build() : null;
            fontFamilyBuild.getClass();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
            int i = ptmVar.d.h;
            int i2 = ptmVar.e;
            Typeface.CustomFallbackBuilder style = customFallbackBuilder.setStyle(new FontStyle(i, a.p(0, 1) ? 1 : 0));
            fontFamilyBuild2.getClass();
            Typeface typefaceBuild = style.addCustomFallback(fontFamilyBuild2).build();
            Paint paint = ptq.b;
            paint.setTypeface(typefaceBuild);
            paint.setFontVariationSettings(ptl.a(ceoVar.b, context));
            return paint.getTypeface();
        } finally {
            this.f.s(null);
        }
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new ptp(this.a, this.b, this.c, this.d, this.e, this.f, uhbVar);
    }
}
