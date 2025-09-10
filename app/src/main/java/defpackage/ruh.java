package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruh implements Callable {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        try {
            System.loadLibrary("speechenhancer_jni_avenhrealtimenative");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
