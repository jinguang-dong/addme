package defpackage;

import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tgs implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;

    public tgs(tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NativeMetadataConverter a() {
        pjo pjoVar = (pjo) this.a.a();
        pjp pjpVarA = ((pab) this.b).a();
        return new NativeMetadataConverter(pjoVar, pjpVarA);
    }
}
