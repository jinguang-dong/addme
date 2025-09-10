package defpackage;

import android.graphics.ImageDecoder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewf implements eqo {
    private final ete a = new etf();

    @Override // defpackage.eqo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, eqm eqmVar) {
        return true;
    }

    @Override // defpackage.eqo
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final esw a(ImageDecoder.Source source, int i, int i2, eqm eqmVar) {
        return new exg(ImageDecoder.decodeBitmap(source, new evz(i, i2, eqmVar)), this.a, 1);
    }
}
