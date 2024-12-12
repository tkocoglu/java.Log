import math

# Adım 1: Noktaların Tanımlanması
points = [(0, 0), (3, 4), (6, 8), (9, 12)]

# Adım 2: Öklid Mesafesi İçin Bir Fonksiyon Yazma
def euclideanDistance(p1, p2):
    return math.sqrt((p2[0] - p1[0])**2 + (p2[1] - p1[1])**2)

# Adım 3: Mesafelerin Hesaplanması
distances = []

for i in range(len(points)):
    for j in range(i + 1, len(points)):
        distance = euclideanDistance(points[i], points[j])
        distances.append(distance)

# Adım 4: Minimum Mesafenin Bulunması
minimum_distance = min(distances)
print(f"Minimum mesafe: {minimum_distance:.2f}")

     
     



