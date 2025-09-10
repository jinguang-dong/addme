package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epe extends epc {
    public epe(Class cls, Class cls2) {
        super("Failed to find any ModelLoaders for model: " + cls.toString() + " and data: " + cls2.toString());
    }

    public epe(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    public epe(Object obj, List list) {
        super(mn.j(obj, list, "Found ModelLoaders for model class: ", ", but none that handle this specific model instance: "));
    }
}
