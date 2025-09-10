package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uji implements ukx, ujh {
    public static final Map a;
    public static final HashMap b;
    public static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    public uji(Class cls) {
        cls.getClass();
        this.f = cls;
    }

    @Override // defpackage.ujh
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.ukx
    public final String b() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = (String) b.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) b.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.ukx
    public final String c() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String str2 = (String) c.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) c.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return ujp.o(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            return ujp.o(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
        }
        simpleName.getClass();
        int iU = ujp.u(simpleName, '$', 0, 6);
        if (iU == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iU + 1, simpleName.length());
        strSubstring.getClass();
        return strSubstring;
    }

    @Override // defpackage.ukx
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class clsAw = this.f;
        Integer num = (Integer) map.get(clsAw);
        if (num != null) {
            return ukc.b(obj, num.intValue());
        }
        if (clsAw.isPrimitive()) {
            clsAw = ske.aw(ske.ax(clsAw));
        }
        return clsAw.isInstance(obj);
    }

    @Override // defpackage.ukx
    public final boolean equals(Object obj) {
        return (obj instanceof uji) && a.ao(ske.aw(this), ske.aw((ukx) obj));
    }

    public final int hashCode() {
        return ske.aw(this).hashCode();
    }

    public final String toString() {
        Class cls = this.f;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }

    static {
        List listAe = rnt.ae(new Class[]{uif.class, uiq.class, uiu.class, uiv.class, uiw.class, uix.class, uiy.class, uiz.class, uja.class, ujb.class, uig.class, uih.class, uii.class, uij.class, uik.class, uil.class, uim.class, uin.class, uio.class, uip.class, uir.class, uis.class, uit.class});
        ArrayList arrayList = new ArrayList(ske.bq(listAe, 10));
        int i = 0;
        for (Object obj : listAe) {
            int i2 = i + 1;
            if (i < 0) {
                ske.bp();
            }
            arrayList.add(new uev((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = ske.bf(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", INRGuObcrHjSQz.zhNq);
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        collectionValues.getClass();
        for (String str : collectionValues) {
            str.getClass();
            uev uevVar = new uev("kotlin.jvm.internal." + ujp.C(str) + INRGuObcrHjSQz.YvJUkp, str.concat(".Companion"));
            map3.put(uevVar.a, uevVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ske.aZ(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), ujp.C((String) entry2.getValue()));
        }
        c = linkedHashMap;
    }
}
