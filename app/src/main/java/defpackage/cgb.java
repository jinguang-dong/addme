package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgb extends coi {
    final /* synthetic */ umk a;
    final /* synthetic */ ceo b;

    public cgb(umk umkVar, ceo ceoVar) {
        this.a = umkVar;
        this.b = ceoVar;
    }

    @Override // defpackage.coi
    public final void h(int i) {
        StringBuilder sb = new StringBuilder("Failed to load ");
        sb.append(this.b);
        sb.append(" (reason=");
        sb.append(i);
        sb.append(", ");
        String str = i != -3 ? i != -2 ? i != -1 ? i != 1 ? i != 2 ? i != 3 ? "Unknown error code" : "The given query was not supported by this provider." : "The provider found the queried font, but it is currently unavailable." : "Font not found, please check availability on GoogleFont.Provider.AllFontsList: https://fonts.gstatic.com/s/a/directory.xml" : "The requested provider was not found on this device." : "The given provider cannot be authenticated with the certificates given." : "Generic error loading font, for example variation settings were not parsable";
        umk umkVar = this.a;
        sb.append(str);
        sb.append(')');
        umkVar.g(new IllegalStateException(sb.toString()));
    }

    @Override // defpackage.coi
    public final void i(Typeface typeface) {
        this.a.fW(typeface);
    }
}
