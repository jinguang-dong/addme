package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import android.util.Pair;
import defpackage.qnj;
import defpackage.qrq;
import defpackage.qrt;
import defpackage.rwc;
import defpackage.sgt;
import defpackage.ton;
import defpackage.tow;
import defpackage.tpc;
import defpackage.tph;
import defpackage.tpw;
import defpackage.tra;
import defpackage.ttr;
import defpackage.tts;
import defpackage.uem;
import defpackage.uzf;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativeCrashHandlerImpl {
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean c;
    private final rwc d;
    private final uem e;

    public NativeCrashHandlerImpl(rwc rwcVar, uem uemVar) {
        this.d = rwcVar;
        this.e = uemVar;
    }

    private static native Pair awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    public final synchronized void a(final qrq qrqVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Thread thread = new Thread(new Runnable() { // from class: qsa
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(qrqVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [sgt, shi] */
    public final /* synthetic */ void b(qrq qrqVar) {
        tpc tpcVarM;
        rwc rwcVar = this.d;
        if (rwcVar.h() && !((Boolean) ((uem) rwcVar.c()).a()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(false)) {
                ((sgt) qnj.a.c().M(5736)).s("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                Pair pairAwaitSignal = awaitSignal();
                if (pairAwaitSignal != null) {
                    try {
                        tpcVarM = tts.a.m();
                        ton tonVarL = ton.L((ByteBuffer) pairAwaitSignal.first);
                        tow towVar = tow.a;
                        tra traVar = tra.a;
                        tpcVarM.f(tonVarL, tow.a);
                    } catch (Throwable unused) {
                        tpcVarM = null;
                    }
                    try {
                        Thread thread = (Thread) pairAwaitSignal.second;
                        if (tpcVarM != null && thread != null) {
                            String name = thread.getName();
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tts ttsVar = (tts) tpcVarM.b;
                            tts ttsVar2 = tts.a;
                            name.getClass();
                            ttsVar.b |= 32;
                            ttsVar.d = name;
                            long id = thread.getId();
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tts ttsVar3 = (tts) tpcVarM.b;
                            ttsVar3.b |= 16;
                            ttsVar3.c = id;
                            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                tpc tpcVarM2 = ttr.a.m();
                                String className = stackTraceElement.getClassName();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                ttr ttrVar = (ttr) tpcVarM2.b;
                                className.getClass();
                                ttrVar.b |= 1;
                                ttrVar.c = className;
                                String methodName = stackTraceElement.getMethodName();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                ttr ttrVar2 = (ttr) tpcVarM2.b;
                                methodName.getClass();
                                ttrVar2.b |= 2;
                                ttrVar2.d = methodName;
                                int lineNumber = stackTraceElement.getLineNumber();
                                if (!tpcVarM2.b.C()) {
                                    tpcVarM2.o();
                                }
                                ttr ttrVar3 = (ttr) tpcVarM2.b;
                                ttrVar3.b |= 8;
                                ttrVar3.f = lineNumber;
                                String fileName = stackTraceElement.getFileName();
                                if (fileName != null) {
                                    if (!tpcVarM2.b.C()) {
                                        tpcVarM2.o();
                                    }
                                    ttr ttrVar4 = (ttr) tpcVarM2.b;
                                    ttrVar4.b |= 4;
                                    ttrVar4.e = fileName;
                                }
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                tts ttsVar4 = (tts) tpcVarM.b;
                                ttr ttrVar5 = (ttr) tpcVarM2.l();
                                ttrVar5.getClass();
                                tpw tpwVar = ttsVar4.e;
                                if (!tpwVar.c()) {
                                    ttsVar4.e = tph.v(tpwVar);
                                }
                                ttsVar4.e.add(ttrVar5);
                            }
                        }
                    } catch (Throwable th) {
                        ((sgt) ((sgt) qnj.a.c().i(th)).M(5735)).s("unable to populate java stack frames");
                    }
                } else {
                    tpcVarM = null;
                }
                if (((Boolean) this.e.a()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                tts ttsVar5 = tpcVarM != null ? (tts) tpcVarM.l() : null;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                tpc tpcVarA = ((qrt) qrqVar).h.a(((qrt) qrqVar).a);
                if (!tpcVarA.b.C()) {
                    tpcVarA.o();
                }
                uzf uzfVar = (uzf) tpcVarA.b;
                uzf uzfVar2 = uzf.a;
                uzfVar.g = 5;
                uzfVar.b |= 16;
                if (ttsVar5 != null) {
                    if (!tpcVarA.b.C()) {
                        tpcVarA.o();
                    }
                    uzf uzfVar3 = (uzf) tpcVarA.b;
                    uzfVar3.j = ttsVar5;
                    uzfVar3.b |= 512;
                }
                ((qrt) qrqVar).l((uzf) tpcVarA.l(), null);
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5737)).s("unable to load native_crash_handler_jni");
        }
    }
}
