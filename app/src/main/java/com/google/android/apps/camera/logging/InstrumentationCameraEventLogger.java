package com.google.android.apps.camera.logging;

import defpackage.jiw;
import defpackage.sod;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InstrumentationCameraEventLogger implements jiw {
    private static final Integer a = 100;
    private static final List b = new ArrayList();

    public static List getAndClearEvents() {
        ArrayList arrayList;
        List list = b;
        synchronized (list) {
            arrayList = new ArrayList(list);
            list.clear();
        }
        return arrayList;
    }

    @Override // defpackage.jiw
    public final void a(sod sodVar) {
        List list = b;
        synchronized (list) {
            int size = list.size();
            a.intValue();
            if (size == 100) {
                list.remove(list.size() - 1);
            }
            list.add(sodVar);
        }
    }
}
