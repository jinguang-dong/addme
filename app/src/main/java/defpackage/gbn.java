package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbn implements tzt {
    private final tzx a;

    public gbn(tzx tzxVar) {
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        List list = (List) Collection.EL.stream((Set) ((tzu) this.a).a).sorted(Comparator$CC.comparing(new gbm(0))).collect(Collectors.toList());
        list.getClass();
        return list;
    }
}
