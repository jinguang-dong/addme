package defpackage;

import android.content.pm.PackageInfo;
import com.google.googlex.gcam.hdrplus.CharacteristicsCache;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfc implements oyz {
    public final pjp a;
    public final PackageInfo b;
    public final CharacteristicsCache c;
    public P11MetadataSerializer d;
    public final hbj e;
    private final qrh f;

    public gfc(pjp pjpVar, qrh qrhVar, PackageInfo packageInfo, CharacteristicsCache characteristicsCache, hbj hbjVar) {
        this.a = pjpVar;
        this.f = qrhVar;
        this.b = packageInfo;
        this.c = characteristicsCache;
        this.e = hbjVar;
    }

    @Override // defpackage.oyz
    public final oyi a(oyj oyjVar, rwc rwcVar, owq owqVar, oxp oxpVar) {
        return new gff(oyjVar, owqVar, this.d, this.f);
    }

    @Override // defpackage.oyz
    public final oym b() {
        return oym.GLOBAL_METADATA;
    }
}
