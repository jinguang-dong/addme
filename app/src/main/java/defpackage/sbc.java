package defpackage;

import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class sbc extends sbv implements Map, ryq {
    private static final long serialVersionUID = 912559;

    public static sbc b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        return new sew(new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    public static sbc c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        ujp.bo(obj7, obj8);
        return new sew(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, 4);
    }

    public static sbc e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        ujp.bo(obj, obj2);
        ujp.bo(obj3, obj4);
        ujp.bo(obj5, obj6);
        ujp.bo(obj7, obj8);
        ujp.bo(obj9, obj10);
        return new sew(new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, 5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract sbc a();

    @Override // defpackage.ryq
    public final /* bridge */ /* synthetic */ ryq d() {
        throw null;
    }

    @Override // defpackage.sbv
    public final /* bridge */ /* synthetic */ sbe f() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ryq
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Set values() {
        throw null;
    }

    @Override // defpackage.sbv, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final scn values() {
        return a().keySet();
    }

    @Override // defpackage.ryq
    @Deprecated
    public final void k(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.sbv
    public Object writeReplace() {
        return new sbb(this);
    }
}
