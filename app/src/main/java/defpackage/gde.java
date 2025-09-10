package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import wireless.android.learning.acmi.p11.metadata.P11MetadataSerializer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gde implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public gde(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vds a() throws PackageManager.NameNotFoundException {
        pjp pjpVarA = ((pab) this.a).a();
        ngw ngwVar = (ngw) this.b.a();
        PackageInfo packageInfoA = ((nmz) this.c).a();
        pjr pjrVarD = ngwVar.d();
        pjrVarD.getClass();
        return new P11MetadataSerializer(pjpVarA, pjrVarD, packageInfoA);
    }
}
