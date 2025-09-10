package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qst implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final tzx e;
    private final tzx f;
    private final tzx g;
    private final tzx h;
    private final tzx i;
    private final tzx j;
    private final tzx k;
    private final tzx l;
    private final tzx m;
    private final tzx n;

    public qst(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14) {
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
        this.e = tzxVar5;
        this.f = tzxVar6;
        this.g = tzxVar7;
        this.h = tzxVar8;
        this.i = tzxVar9;
        this.j = tzxVar10;
        this.k = tzxVar11;
        this.l = tzxVar12;
        this.m = tzxVar13;
        this.n = tzxVar14;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* bridge */ /* synthetic */ Object a() {
        qqq qqqVarA = ((qqr) this.a).a();
        Context contextB = ((imm) this.b).b();
        qpf qpfVar = (qpf) this.c.a();
        tzj tzjVarB = tzs.b(this.d);
        Object objA = this.e.a();
        Executor executor = (Executor) this.h.a();
        Object obj = ((tzu) this.m).a;
        return new qss(qqqVarA, contextB, qpfVar, tzjVarB, (qso) objA, this.f, this.g, executor, ((qti) this.i).a(), this.j, ((qta) this.k).a(), ((qtc) this.l).a(), (rwc) obj, this.n);
    }
}
