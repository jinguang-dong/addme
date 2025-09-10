package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqm implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public jqm(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MediaFormat a() {
        hbj hbjVar = (hbj) this.a.a();
        String strA = ((jqt) this.b).a();
        pas pasVar = (pas) this.c.a();
        boolean zP = hbjVar.p(gzo.S);
        gzi gziVar = gzz.a;
        MediaFormat mediaFormatA = jsw.a(pasVar, 12000000, 0.23333333f, strA, zP, hbjVar.p(gzz.x));
        mediaFormatA.getClass();
        return mediaFormatA;
    }
}
