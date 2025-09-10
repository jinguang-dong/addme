package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dwu {
    public abstract dwi a(Context context, String str, WorkerParameters workerParameters);

    public final dwi b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        dwi dwiVarA = a(context, str, workerParameters);
        if (dwiVarA == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(dwi.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    dwiVarA = (dwi) objNewInstance;
                } catch (Throwable th) {
                    dwj.b();
                    Log.e(dwv.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                dwj.b();
                Log.e(dwv.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!dwiVarA.d) {
            return dwiVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
