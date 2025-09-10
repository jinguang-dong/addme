package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzo implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;

    public jzo(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jyo a() {
        tzj tzjVarB = tzs.b(this.a);
        tzj tzjVarB2 = tzs.b(this.b);
        Handler handler = (Handler) this.c.a();
        lat latVar = (lat) this.d.a();
        kbr kbrVar = (kbr) tzjVarB.a();
        return new jyo(kbrVar, handler, latVar);
    }
}
